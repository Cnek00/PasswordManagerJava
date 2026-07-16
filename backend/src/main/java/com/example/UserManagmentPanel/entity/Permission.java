package com.example.UserManagmentPanel.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String action; // Örn: "READ", "WRITE", "DELETE", "MANAGE_USERS"

    @Column(name = "is_delegatable")
    private boolean delegatable = false;

    // Lombok getter/setter uyumu: isDelegatable → delegatable field adı
    public boolean isDelegatable() {
        return delegatable;
    }

    public void setDelegatable(boolean delegatable) {
        this.delegatable = delegatable;
    }
}