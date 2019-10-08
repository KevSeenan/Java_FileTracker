package com.codeclan.example.FileTracker.components;

import com.codeclan.example.FileTracker.models.File;
import com.codeclan.example.FileTracker.models.Folder;
import com.codeclan.example.FileTracker.models.User;
import com.codeclan.example.FileTracker.repository.FileRepository;
import com.codeclan.example.FileTracker.repository.FolderRepository;
import com.codeclan.example.FileTracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User user1 = new User("Kev");
        userRepository.save(user1);

        Folder documents = new Folder("Documents", user1);
        folderRepository.save(documents);

        File file1 = new File("Novel",".doc", 2, documents);
        fileRepository.save(file1);
    }
}
