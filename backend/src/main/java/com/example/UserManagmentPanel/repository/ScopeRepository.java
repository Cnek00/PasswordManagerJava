package com.example.UserManagmentPanel.repository;

import com.example.UserManagmentPanel.entity.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ScopeRepository extends JpaRepository<Scope, Long> {
    Optional<Scope> findByScopeKey(String scopeKey);
}