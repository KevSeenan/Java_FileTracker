package com.codeclan.example.FileTracker.repository;

import com.codeclan.example.FileTracker.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
