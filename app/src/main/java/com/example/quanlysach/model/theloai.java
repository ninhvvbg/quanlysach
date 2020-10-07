package com.example.quanlysach.model;

public class theloai {
    private  String matheloai;
    private  String tentheloai;
    private  int vitri;

    public theloai() {
    }

    public theloai(String matheloai, String tentheloai, int vitri) {
        this.matheloai = matheloai;
        this.tentheloai = tentheloai;
        this.vitri = vitri;
    }

    public String getMatheloai() {
        return matheloai;
    }

    public void setMatheloai(String matheloai) {
        this.matheloai = matheloai;
    }

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }

    public int getVitri() {
        return vitri;
    }

    public void setVitri(int vitri) {
        this.vitri = vitri;
    }

    @Override
    public String toString() {
        return "theloai{" +
                "matheloai='" + matheloai + '\'' +
                ", tentheloai='" + tentheloai + '\'' +
                ", vitri=" + vitri +
                '}';
    }
}
