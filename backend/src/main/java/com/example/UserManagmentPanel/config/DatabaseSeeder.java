package com.example.UserManagmentPanel.config;

import com.example.UserManagmentPanel.entity.*;
import com.example.UserManagmentPanel.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseSeeder {

    @Bean
    CommandLineRunner seedDatabase(
            RankRepository rankRepository,
            PermissionRepository permissionRepository,
            ScopeRepository scopeRepository,
            RoleRepository roleRepository,
            UserRepository userRepository
    ) {
        return args -> {
            // Sadece veri yoksa ekle (idempotent seed)
            if (rankRepository.count() == 0) {
                System.out.println("🌱 Veri tabanı boş, seed verisi ekleniyor...");

                // ─── 1. Ranks (Hiyerarşik Dereceler) ───────────────────
                Rank superAdmin = new Rank(null, "SUPER_ADMIN", 100);
                Rank admin = new Rank(null, "ADMIN", 80);
                Rank moderator = new Rank(null, "MODERATOR", 50);
                Rank editor = new Rank(null, "EDITOR", 30);
                Rank user = new Rank(null, "USER", 10);
                Rank guest = new Rank(null, "GUEST", 1);
                rankRepository.save(superAdmin);
                rankRepository.save(admin);
                rankRepository.save(moderator);
                rankRepository.save(editor);
                rankRepository.save(user);
                rankRepository.save(guest);

                // ─── 2. Permissions (Yetki Tanımları) ──────────────────
                Permission read = new Permission();
                read.setAction("READ");
                read.setDelegatable(false);

                Permission write = new Permission();
                write.setAction("WRITE");
                write.setDelegatable(true);

                Permission delete = new Permission();
                delete.setAction("DELETE");
                delete.setDelegatable(true);

                Permission manageUsers = new Permission();
                manageUsers.setAction("MANAGE_USERS");
                manageUsers.setDelegatable(true);

                Permission viewReports = new Permission();
                viewReports.setAction("VIEW_REPORTS");
                viewReports.setDelegatable(false);

                Permission exportData = new Permission();
                exportData.setAction("EXPORT_DATA");
                exportData.setDelegatable(true);

                Permission manageSettings = new Permission();
                manageSettings.setAction("MANAGE_SETTINGS");
                manageSettings.setDelegatable(false);

                permissionRepository.save(read);
                permissionRepository.save(write);
                permissionRepository.save(delete);
                permissionRepository.save(manageUsers);
                permissionRepository.save(viewReports);
                permissionRepository.save(exportData);
                permissionRepository.save(manageSettings);

                // ─── 3. Scopes (Etki Alanları / Bağlamlar) ─────────────
                Scope system = new Scope(null, "SYSTEM", "Tüm Sistem Erişimi");
                Scope financeModule = new Scope(null, "FINANCE_MODULE", "Finans ve Muhasebe Modülü");
                Scope hrModule = new Scope(null, "HR_MODULE", "İnsan Kaynakları Modülü");
                Scope projectModule = new Scope(null, "PROJECT_MODULE", "Proje Yönetim Modülü");
                Scope inventoryModule = new Scope(null, "INVENTORY_MODULE", "Envanter ve Stok Modülü");
                Scope reportModule = new Scope(null, "REPORT_MODULE", "Raporlama Modülü");
                scopeRepository.save(system);
                scopeRepository.save(financeModule);
                scopeRepository.save(hrModule);
                scopeRepository.save(projectModule);
                scopeRepository.save(inventoryModule);
                scopeRepository.save(reportModule);

                // ─── 4. Roles (Geriye uyumluluk) ───────────────────────
                Role adminRole = new Role(null, RoleType.ROLE_ADMIN);
                Role userRole = new Role(null, RoleType.ROLE_USER);
                roleRepository.save(adminRole);
                roleRepository.save(userRole);

                // ─── 5. Varsayılan Admin Kullanıcı ─────────────────────
                User defaultAdmin = new User();
                defaultAdmin.setUsername("admin");
                defaultAdmin.setEmail("admin@yonetimpaneli.com");
                defaultAdmin.setPassword("admin123");
                defaultAdmin.setEnabled(true);
                defaultAdmin.setRank(superAdmin);
                userRepository.save(defaultAdmin);

                // ─── 6. Örnek Kullanıcılar ─────────────────────────────
                User moderatorUser = new User();
                moderatorUser.setUsername("moderator");
                moderatorUser.setEmail("moderator@yonetimpaneli.com");
                moderatorUser.setPassword("mod123");
                moderatorUser.setEnabled(true);
                moderatorUser.setRank(moderator);
                userRepository.save(moderatorUser);

                User normalUser = new User();
                normalUser.setUsername("kullanici");
                normalUser.setEmail("kullanici@yonetimpaneli.com");
                normalUser.setPassword("user123");
                normalUser.setEnabled(true);
                normalUser.setRank(user);
                userRepository.save(normalUser);

                User guestUser = new User();
                guestUser.setUsername("misafir");
                guestUser.setEmail("misafir@yonetimpaneli.com");
                guestUser.setPassword("guest123");
                guestUser.setEnabled(false);
                guestUser.setRank(guest);
                userRepository.save(guestUser);

                System.out.println("✅ Seed verisi başarıyla oluşturuldu! (6 Rank, 7 Permission, 6 Scope, 4 User)");
            } else {
                System.out.println("ℹ️ Veri tabanında zaten veri var, seed atlandı.");
            }
        };
    }
}