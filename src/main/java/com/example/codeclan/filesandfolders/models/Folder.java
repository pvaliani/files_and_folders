package com.example.codeclan.filesandfolders.models;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private Long id;
    private String title;
    private List<File> files;
    private User user;

    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
        this.files = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Folder(){

    }

}
