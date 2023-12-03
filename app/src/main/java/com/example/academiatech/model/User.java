package com.example.academiatech.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.Objects;


@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String name;
    private String email;
    private String gender;
    private Date birthdate;
    private String nickName;
    private String password;
    private String passwordRepeat;

    public User() {
    }

    public User(Long id, String name, String email, String gender, Date birthdate, String nickName, String password, String passwordRepeat) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.birthdate = birthdate;
        this.nickName = nickName;
        this.password = password;
        this.passwordRepeat = passwordRepeat;
    }

    public User(String name, String email, String gender, Date birthdate, String nickname, String password, String passwordRepeat) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.birthdate = birthdate;
        this.nickName = nickname;
        this.password = password;
        this.passwordRepeat = passwordRepeat;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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

    public String getPasswordRepeat() {
        return passwordRepeat;
    }

    public void setPasswordRepeat(String imageUser) {
        this.passwordRepeat = passwordRepeat;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", passwordRepeat='" + passwordRepeat + '\'' +
                '}';
    }
}
