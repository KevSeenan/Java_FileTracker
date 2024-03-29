package com.codeclan.example.FileTracker.repository;

import com.codeclan.example.FileTracker.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
