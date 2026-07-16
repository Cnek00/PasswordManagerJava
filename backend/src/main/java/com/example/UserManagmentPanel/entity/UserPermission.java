package com.example.UserManagmentPanel.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "permission_id", nullable = false)
    private Permission permission;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "scope_id", nullable = false)
    private Scope scope;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "granted_by_id")
    private User grantedBy;
}