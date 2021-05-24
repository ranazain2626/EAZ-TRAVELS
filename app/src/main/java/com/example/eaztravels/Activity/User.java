package com.example.eaztravels.Activity;

public class User {
    private String email,password,username;
    public User() {
    }

    public User(String email, String password){
        this.email=email;
        this.password=password;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return username;
    }



}
