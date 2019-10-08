package com.codeclan.example.FileTracker.repository;

import com.codeclan.example.FileTracker.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<Folder, Long> {
}
