package com.example.UserManagmentPanel.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ranks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // Örn: "SUPER_ADMIN", "ADMIN", "MODERATOR", "EDITOR", "USER", "GUEST"

    @Column(nullable = false)
    private int level; // Örn: 100, 80, 50, 30, 10, 1
}