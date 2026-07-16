package com.example.UserManagmentPanel.controller;

import com.example.UserManagmentPanel.entity.*;
import com.example.UserManagmentPanel.repository.*;
import com.example.UserManagmentPanel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RankRepository rankRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private ScopeRepository scopeRepository;

    @Autowired
    private UserPermissionRepository userPermissionRepository;

    // ─── Kullanıcı Listeleme ───────────────────────────────
    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "user-list";
    }

    // ─── Yeni Kullanıcı Formu ──────────────────────────────
    @GetMapping("/new")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("allRanks", rankRepository.findAll());
        return "register";
    }

    // ─── Yeni Kullanıcı Kaydetme ───────────────────────────
    @PostMapping("/save")
    public String saveUser(@ModelAttribute User user, @RequestParam(value = "rankId", required = false) Long rankId) {
        if (rankId != null) {
            Rank selectedRank = rankRepository.findById(rankId)
                    .orElseThrow(() -> new RuntimeException("Seçilen rütbe bulunamadı!"));
            user.setRank(selectedRank);
        } else {
            Rank defaultRank = rankRepository.findByName("USER")
                    .orElseThrow(() -> new RuntimeException("Varsayılan 'USER' rütbesi bulunamadı!"));
            user.setRank(defaultRank);
        }
        userRepository.save(user);
        return "redirect:/users";
    }

    // ─── Aktif/Pasif Yapma ─────────────────────────────────
    @GetMapping("/toggle/{id}")
    public String toggleUser(@PathVariable Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı: " + id));
        user.setEnabled(!user.isEnabled());
        userRepository.save(user);
        return "redirect:/users";
    }

    // ─── Silme ─────────────────────────────────────────────
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "redirect:/users";
    }

    // ═══ Yetki Yönetim Sayfası ═════════════════════════════
    @GetMapping("/{id}/permissions")
    public String showPermissionPage(@PathVariable Long id, Model model) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı: " + id));

        model.addAttribute("user", user);
        model.addAttribute("allRanks", rankRepository.findAll());
        model.addAttribute("allPermissions", permissionRepository.findAll());
        model.addAttribute("allScopes", scopeRepository.findAll());
        model.addAttribute("userPermissions", userPermissionRepository.findByUserId(id));
        return "user-permissions";
    }

    // ═══ Rank Güncelleme ═══════════════════════════════════
    @PostMapping("/{id}/update-rank")
    public String updateRank(@PathVariable Long id, @RequestParam Long rankId) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı: " + id));
        Rank newRank = rankRepository.findById(rankId)
                .orElseThrow(() -> new RuntimeException("Rütbe bulunamadı: " + rankId));
        user.setRank(newRank);
        userRepository.save(user);
        return "redirect:/users/" + id + "/permissions?successRank";
    }

    // ═══ Yetki Tanımlama (Grant Permission) ════════════════
    @PostMapping("/{id}/grant-permission")
    public String grantPermission(@PathVariable Long id,
                                  @RequestParam Long permissionId,
                                  @RequestParam Long scopeId,
                                  @RequestParam(value = "grantedById", required = false) Long grantedById) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı: " + id));
        Permission permission = permissionRepository.findById(permissionId)
                .orElseThrow(() -> new RuntimeException("Yetki bulunamadı: " + permissionId));
        Scope scope = scopeRepository.findById(scopeId)
                .orElseThrow(() -> new RuntimeException("Scope bulunamadı: " + scopeId));

        UserPermission up = new UserPermission();
        up.setUser(user);
        up.setPermission(permission);
        up.setScope(scope);

        if (grantedById != null) {
            User grantedBy = userRepository.findById(grantedById).orElse(null);
            up.setGrantedBy(grantedBy);
        }

        userPermissionRepository.save(up);
        return "redirect:/users/" + id + "/permissions?successPermission";
    }

    // ═══ Yetki Geri Alma (Revoke) ══════════════════════════
    @PostMapping("/{id}/revoke-permission/{upId}")
    public String revokePermission(@PathVariable Long id, @PathVariable Long upId) {
        userPermissionRepository.deleteById(upId);
        return "redirect:/users/" + id + "/permissions?successRevoke";
    }
}