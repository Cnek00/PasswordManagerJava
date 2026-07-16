package com.example.UserManagmentPanel.service;

import com.example.UserManagmentPanel.entity.User;
import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void deleteById(Long id);
}