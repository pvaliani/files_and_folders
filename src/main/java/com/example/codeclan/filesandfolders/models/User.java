package com.example.codeclan.filesandfolders.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {

//    column generation for the newly created table for the user model

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Column(name="name")
    private String name;

//  user has a one to many relationship with folders and we use jsonignore to
//  stop the serialization/repetition of nesting json within the API

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user")
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

//    user can have a folder added to them
    public void addFolder(Folder folder){
        this.folders.add(folder);
    }


}
