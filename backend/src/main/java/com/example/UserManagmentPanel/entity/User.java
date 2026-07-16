package com.example.UserManagmentPanel.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "app_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private boolean enabled = true;

    // --- Hiyerarşik Sınıf (Rank) ---
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rank_id")
    private Rank rank;

    // --- Dinamik İzin Atamaları ---
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserPermission> permissions = new ArrayList<>();
}