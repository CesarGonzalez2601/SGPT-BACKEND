package com.example.SGPT_BACKEND.model.dto.users;


public class UsersRQ {

    private String userName;

    private String email;

    private String password;

    private Boolean userStatus;

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

    public UsersRQ(String userName, String email, String password, Boolean userStatus) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.userStatus = userStatus;
    }

    public UsersRQ() {
    }
}
