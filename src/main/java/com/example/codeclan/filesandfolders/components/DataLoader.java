package com.example.codeclan.filesandfolders.components;


import com.example.codeclan.filesandfolders.models.File;
import com.example.codeclan.filesandfolders.models.Folder;
import com.example.codeclan.filesandfolders.models.User;
import com.example.codeclan.filesandfolders.repositories.FileRepository;
import com.example.codeclan.filesandfolders.repositories.FolderRepository;
import com.example.codeclan.filesandfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

//    instantiate each repository type here

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

//Seeds for db
    public DataLoader(){

        User pedzilla = new User("Pedram");
        userRepository.save(pedzilla);

        Folder codeclan = new Folder("Codeclan Stuff", pedzilla);
        folderRepository.save(codeclan);

        Folder screenshots = new Folder("Screenshots", pedzilla);
        folderRepository.save(screenshots);

        File homework = new File("homework", ".pdf", "30mb", codeclan);
        fileRepository.save(homework);

        File shoes = new File("Shoes", ".jpg", "50mb", screenshots);
        fileRepository.save(shoes);

        File cv = new File("CV", ".txt", "100mb", codeclan);
        fileRepository.save(cv);

        File halloween = new File("Halloween dress up", ".jpg", "200mb", screenshots);
        fileRepository.save(halloween);

        codeclan.addFile(homework);
        codeclan.addFile(cv);
        screenshots.addFile(shoes);
        screenshots.addFile(halloween);

        folderRepository.save(codeclan);
        folderRepository.save(screenshots);

        pedzilla.addFolder(codeclan);
        pedzilla.addFolder(screenshots);

        userRepository.save(pedzilla);


    }


}
