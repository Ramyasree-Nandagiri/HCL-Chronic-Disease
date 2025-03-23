package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LoginEntity;

public interface LoginRepository  extends JpaRepository<LoginEntity, Integer> {
	
    Optional<LoginEntity> findByEmail(String email);
}
