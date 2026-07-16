package com.example.UserManagmentPanel.repository;

import com.example.UserManagmentPanel.entity.Role;
import com.example.UserManagmentPanel.entity.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleType name);
}