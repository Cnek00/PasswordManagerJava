package com.example.UserManagmentPanel.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "scopes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Scope {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String scopeKey; // Örn: "SYSTEM", "FINANCE_MODULE", "HR_MODULE"

    private String description; // Kullanıcıya açıklama: "Tüm Sistem Erişimi" vb.
}