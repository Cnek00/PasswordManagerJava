package com.example.UserManagmentPanel.service;

import com.example.UserManagmentPanel.entity.*;
import com.example.UserManagmentPanel.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserPermissionRepository userPermissionRepository;

    /**
     * Verilen kullanıcının, belirtilen scope üzerinde belirtilen eylemi yapıp yapamayacağını kontrol eder.
     * Mantık:
     * 1. Kullanıcının Rank seviyesi 80+ ise (ADMIN ve üstü) her şeyi yapabilir.
     * 2. Aksi halde UserPermission tablosunda doğrudan atanmış yetki aranır.
     */
    public boolean hasPermission(Long userId, String action, String scopeKey) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı: " + userId));

        // 1. Rank seviyesine göre hızlı kontrol
        if (user.getRank() != null && user.getRank().getLevel() >= 80) {
            return true;
        }

        // 2. Dinamik UserPermission tablosuna bak
        List<UserPermission> directPermissions = userPermissionRepository.findByUserId(userId);
        for (UserPermission up : directPermissions) {
            if (up.getPermission().getAction().equalsIgnoreCase(action)
                    && up.getScope().getScopeKey().equalsIgnoreCase(scopeKey)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Bir kullanıcının, başka bir kullanıcıya yetki devredip devredemeyeceğini kontrol eder.
     */
    public boolean canDelegate(Long grantorId, String action, String scopeKey) {
        User grantor = userRepository.findById(grantorId)
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı: " + grantorId));

        // Yüksek rütbeliler her zaman devredebilir
        if (grantor.getRank() != null && grantor.getRank().getLevel() >= 80) {
            return true;
        }

        List<UserPermission> directPermissions = userPermissionRepository.findByUserId(grantorId);
        for (UserPermission up : directPermissions) {
            if (up.getPermission().getAction().equalsIgnoreCase(action)
                    && up.getScope().getScopeKey().equalsIgnoreCase(scopeKey)
                    && up.getPermission().isDelegatable()) {
                return true;
            }
        }

        return false;
    }

    /**
     * Bir kullanıcının başka bir kullanıcı üzerinde işlem yapıp yapamayacağını kontrol eder.
     * Kural: Kendi rank seviyesinden düşük seviyedeki kullanıcılara işlem yapabilir.
     */
    public boolean canActOn(Long actorId, Long targetId) {
        User actor = userRepository.findById(actorId)
                .orElseThrow(() -> new RuntimeException("Aktör bulunamadı: " + actorId));
        User target = userRepository.findById(targetId)
                .orElseThrow(() -> new RuntimeException("Hedef bulunamadı: " + targetId));

        if (actor.getRank() == null || target.getRank() == null) {
            return false;
        }

        return actor.getRank().getLevel() > target.getRank().getLevel();
    }
}