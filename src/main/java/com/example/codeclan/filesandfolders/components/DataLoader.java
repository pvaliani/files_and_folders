package com.example.codeclan.filesandfolders.components;


import com.example.codeclan.filesandfolders.models.File;
import com.example.codeclan.filesandfolders.models.Folder;
import com.example.codeclan.filesandfolders.models.User;
import com.example.codeclan.filesandfolders.repositories.FileRepository;
import com.example.codeclan.filesandfolders.repositories.FolderRepository;
import com.example.codeclan.filesandfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component
public class DataLoader implements ApplicationRunner {

//    instantiate each repository type here

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){

    }

//Seeds for db
    public void run(ApplicationArguments args){

        User user1 = new User("Pedram");
        userRepository.save(user1);

        User user2 = new User("Michael");
        userRepository.save(user2);

        Folder folder = new Folder("Videos", user1);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Games", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Trips", user2);
        folderRepository.save(folder3);

        File file = new File("Tech book", "PDF", "100mb", folder);
        fileRepository.save(file);

        File  file2 = new File("holiday pic1", "png", "200mb", folder2);
        fileRepository.save(file2);

        File file3 = new File("holiday pic2", "png", "300mb", folder2);
        fileRepository.save(file3);

    }


}
