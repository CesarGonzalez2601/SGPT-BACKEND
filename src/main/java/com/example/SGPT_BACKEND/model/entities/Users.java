package com.example.SGPT_BACKEND.model.entities;

import jakarta.persistence.*;
import lombok.*;


@ToString
@Getter
@Setter
@Entity
@Table(name = "users", schema = "gestion")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "user_status")
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

    public Users(Integer idUser, String userName, String email, String password, Boolean userStatus) {
        this.idUser = idUser;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.userStatus = userStatus;
    }

    public Users() {
    }
}
