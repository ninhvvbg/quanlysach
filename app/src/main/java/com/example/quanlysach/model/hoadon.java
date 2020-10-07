package com.example.quanlysach.model;

public class hoadon {
    private String mahoadon;
    private String theloaisach;
    private  String tensach;
    private  String tenkhachhang;
    private  String tennhanvienban;
    private String phonekhachhang;
    private String soluongsachmua;
    private String giaban;
    private String tongthanhtoan;

    public hoadon() {
    }

    public hoadon(String mahoadon, String theloaisach, String tensach, String tenkhachhang, String tennhanvienban,
                  String phonekhachhang, String soluongsachmua, String giaban, String tongthanhtoan) {
        this.mahoadon = mahoadon;
        this.theloaisach = theloaisach;
        this.tensach = tensach;
        this.tenkhachhang = tenkhachhang;
        this.tennhanvienban = tennhanvienban;
        this.phonekhachhang = phonekhachhang;
        this.soluongsachmua = soluongsachmua;
        this.giaban = giaban;
        this.tongthanhtoan = tongthanhtoan;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getTheloaisach() {
        return theloaisach;
    }

    public void setTheloaisach(String theloaisach) {
        this.theloaisach = theloaisach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getTennhanvienban() {
        return tennhanvienban;
    }

    public void setTennhanvienban(String tennhanvienban) {
        this.tennhanvienban = tennhanvienban;
    }

    public String getPhonekhachhang() {
        return phonekhachhang;
    }

    public void setPhonekhachhang(String phonekhachhang) {
        this.phonekhachhang = phonekhachhang;
    }

    public String getSoluongsachmua() {
        return soluongsachmua;
    }

    public void setSoluongsachmua(String soluongsachmua) {
        this.soluongsachmua = soluongsachmua;
    }

    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }

    public String getTongthanhtoan() {
        return tongthanhtoan;
    }

    public void setTongthanhtoan(String tongthanhtoan) {
        this.tongthanhtoan = tongthanhtoan;
    }

    @Override
    public String toString() {
        return "hoadon{" +
                "mahoadon='" + mahoadon + '\'' +
                ", theloaisach='" + theloaisach + '\'' +
                ", tensach='" + tensach + '\'' +
                ", tenkhachhang='" + tenkhachhang + '\'' +
                ", tennhanvienban='" + tennhanvienban + '\'' +
                ", phonekhachhang='" + phonekhachhang + '\'' +
                ", soluongsachmua='" + soluongsachmua + '\'' +
                ", giaban='" + giaban + '\'' +
                ", tongthanhtoan='" + tongthanhtoan + '\'' +
                '}';
    }
}
