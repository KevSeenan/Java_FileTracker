package com.codeclan.example.FileTracker.repository;

import com.codeclan.example.FileTracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
