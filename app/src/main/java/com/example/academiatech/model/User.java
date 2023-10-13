package com.example.academiatech.model;

import com.example.academiatech.model.enums.Gender;

import java.util.Objects;

public class User {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
    private String nickName;
    private String password;
    private String imageUser;

    public User() {
    }

    public User(Long id, String name, String email, Gender gender, String nickName, String password, String imageUser) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.nickName = nickName;
        this.password = password;
        this.imageUser = imageUser;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImageUser() {
        return imageUser;
    }

    public void setImageUser(String imageUser) {
        this.imageUser = imageUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
