package com.example.quanlysach.model;

public class nguoidung {
    private String manguoiung;
    private String tennguoidung;
    private String phone;
    private String username;
    private  String pass;

    public nguoidung(String nguoidung, String tennguoidung, String sodienthoai, String user, String pass, String pass2) {
    }

    public nguoidung() {
        this.manguoiung = manguoiung;
        this.tennguoidung = tennguoidung;
        this.phone = phone;
        this.username = username;
        this.pass = pass;
    }

    public String getManguoiung() {
        return manguoiung;
    }

    public void setManguoiung(String manguoiung) {
        this.manguoiung = manguoiung;
    }

    public String getTennguoidung() {
        return tennguoidung;
    }

    public void setTennguoidung(String tennguoidung) {
        this.tennguoidung = tennguoidung;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "nguoidung{" +
                "manguoiung='" + manguoiung + '\'' +
                ", tennguoidung='" + tennguoidung + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }


}
