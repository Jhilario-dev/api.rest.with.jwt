package com.reto.proyecto.inicial.reto.repository;

import com.reto.proyecto.inicial.reto.controller.UserController;
import com.reto.proyecto.inicial.reto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}