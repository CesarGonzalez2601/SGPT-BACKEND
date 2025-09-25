package com.example.SGPT_BACKEND.model.dto.users;

import jakarta.persistence.*;
import lombok.*;

public class UsersRS {

    private Integer idUser;

    private String userName;

    private String email;

    private String password;

    private Boolean userStatus;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }

    public UsersRS(Integer idUser, String userName, String email, String password, Boolean userStatus) {
        this.idUser = idUser;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.userStatus = userStatus;
    }

    public UsersRS() {
    }
}
