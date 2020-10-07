package com.example.quanlysach.model;

public class sach {
    private String mabarcode ;
    private  String tensach;
    private  String nhaxuatban;
    private  String tacgia ;
    private  String theloai;
    private String soluong;
    private String giaban;

    public sach() {
    }

    public sach(String mabarcode, String tensach, String nhaxuatban, String tacgia, String theloai, String soluong, String giaban) {
        this.mabarcode = mabarcode;
        this.tensach = tensach;
        this.nhaxuatban = nhaxuatban;
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.soluong = soluong;
        this.giaban = giaban;
    }

    public String getMabarcode() {
        return mabarcode;
    }

    public void setMabarcode(String mabarcode) {
        this.mabarcode = mabarcode;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        return "sach{" +
                "mabarcode='" + mabarcode + '\'' +
                ", tensach='" + tensach + '\'' +
                ", nhaxuatban='" + nhaxuatban + '\'' +
                ", tacgia='" + tacgia + '\'' +
                ", theloai='" + theloai + '\'' +
                ", soluong='" + soluong + '\'' +
                ", giaban='" + giaban + '\'' +
                '}';
    }
}
