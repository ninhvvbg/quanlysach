package com.example.quanlysach.model;

public class user {
    private int mauser;
    private String user, Fullname, Password, phone;
    private int Quyen;

    public user() {

    }

    public user(int mauser, String user, String fullname, String password, String phone, int quyen) {
        this.mauser = mauser;
        this.user = user;
        Fullname = fullname;
        Password = password;
        this.phone = phone;
        Quyen = quyen;
    }

    public int getMauser() {
        return mauser;
    }

    public void setMauser(int mauser) {
        this.mauser = mauser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getQuyen() {
        return Quyen;
    }

    public void setQuyen(int quyen) {
        Quyen = quyen;
    }
}
