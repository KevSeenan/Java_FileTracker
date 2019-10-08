package com.codeclan.example.FileTracker;

import com.codeclan.example.FileTracker.models.File;
import com.codeclan.example.FileTracker.models.Folder;
import com.codeclan.example.FileTracker.models.User;
import com.codeclan.example.FileTracker.repository.FileRepository;
import com.codeclan.example.FileTracker.repository.FolderRepository;
import com.codeclan.example.FileTracker.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileTrackerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	public void createUserandFolderThenSave() {
		User user1 = new User("Kev");
		userRepository.save(user1);
		Folder documents = new Folder("Documents", user1);
		folderRepository.save(documents);
	}

	public void createFolderAndFileThenSave() {
		User user1 = new User("Kev");
		userRepository.save(user1);
		Folder documents = new Folder("Documents", user1);
		folderRepository.save(documents);

		File file1 = new File("Novel",".doc", 2, documents);
		fileRepository.save(file1);

		documents.addFile(file1);
		fileRepository.save(file1);
	}


}
