package com.example.quanlysach.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.quanlysach.all.all.themnguoidung;

public class database extends SQLiteOpenHelper {
    private Context context;

    public database(Context context){
        super(context,"database",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String theloai = "CREATE TABLE theloai(matheloai char primary key not null,tentheloai nvarchar (50) , vitri integer)";
        String sach = "CREATE TABLE sach(masach char(5) primary key not null,tensach navarchar(50), matheloai char(50) , tacgia navarchar (50),NXB nvarchar (50),giasach FLOAT, soluong int not null)";
        String hoadon = "CREATE TABLE hoadon(mahoadon nvarchar(7) primary key not null ,matheloai char(50) , tensach navarchar(50),tenkhachhang navrchar(50), tennhanvien navarchar(50),phonekhachhang nvarchar(10)" +
                ",soluongmua int not null,giaban FLOAT, tongthanhtoan FLOAT)";
        String nguoidung1 = "CREATE TABLE nguoidung(username nvarchar(50) primary key not null ,tennguoidung nvarchar(50) , phone nvarchar(10),pass nvarchar(10)not null)";



        sqLiteDatabase.execSQL(theloai);
        sqLiteDatabase.execSQL(sach);
        sqLiteDatabase.execSQL(hoadon);
        sqLiteDatabase.execSQL(nguoidung1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
