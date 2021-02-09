package com.example.codeclan.filesandfolders.models;


import javax.persistence.Entity;
import java.util.List;

@Entity(name="users")
public class User {

    private Long id;
    private String name;
    private List<Folder> folders;

    public User(String name) {
        this.name = name;
        this.folders = folders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public User(){
    }


}
