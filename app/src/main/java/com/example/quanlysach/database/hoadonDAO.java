package com.example.quanlysach.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlysach.model.hoadon;

import java.util.ArrayList;
import java.util.List;

public class hoadonDAO {
    private  database database;
    public hoadonDAO(database database){
        this.database = database;
    }
    public long themhoadon(hoadon hoadon){
        SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mahoadon",hoadon.getMahoadon());
        contentValues.put("matheloai",hoadon.getTheloaisach());
        contentValues.put("tensach",hoadon.getTensach());
        contentValues.put("tenkhachhang",hoadon.getTenkhachhang());
        contentValues.put("tennhanvien",hoadon.getTennhanvienban());
        contentValues.put("phonekhachhang",hoadon.getPhonekhachhang());
        contentValues.put("soluongmua",hoadon.getSoluongsachmua());
        contentValues.put("giaban",hoadon.getGiaban());
        contentValues.put("tongthanhtoan",hoadon.getTongthanhtoan());

        return sqLiteDatabase.insert("hoadon",null,contentValues);
    }
    public void xoahoadon(String mahoadon){
        SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
        sqLiteDatabase.delete("hoadon","mahoadon=?",new String[]{mahoadon});
    }
    public List<hoadon> getallhoadon(){
        List<hoadon> hoadonList  = new ArrayList<>();
        String truyvan = "SELECT * FROM hoadon";
        Cursor cursor = database.getWritableDatabase().rawQuery(truyvan,null);
        if (cursor.getCount()>0){
            cursor.moveToFirst();
            while (cursor.isAfterLast() == false){
                String mahoadon = cursor.getString(cursor.getColumnIndex("mahoadon"));
                String matheloai = cursor.getString(cursor.getColumnIndex("matheloai"));
                String tensach = cursor.getString(cursor.getColumnIndex("tensach"));
                String tenkhachhang = cursor.getString(cursor.getColumnIndex("tenkhachhang"));
                String tennhanvien = cursor.getString(cursor.getColumnIndex("tennhanvien"));
                String phonekhachhang = cursor.getString(cursor.getColumnIndex("phonekhachhang"));
                String soluongmua = cursor.getString(cursor.getColumnIndex("soluongmua"));
                String giaban = cursor.getString(cursor.getColumnIndex("giaban"));
                String tongthanhtoan = cursor.getString(cursor.getColumnIndex("tongthanhtoan"));

                hoadon hoadon1 = new hoadon();
               hoadon1.setMahoadon(mahoadon);
               hoadon1.setTheloaisach(matheloai);
               hoadon1.setTensach(tensach);
               hoadon1.setTenkhachhang(tenkhachhang);
               hoadon1.setTennhanvienban(tennhanvien);
               hoadon1.setPhonekhachhang(phonekhachhang);
               hoadon1.setSoluongsachmua(soluongmua);
               hoadon1.setGiaban(giaban);
               hoadon1.setTongthanhtoan(tongthanhtoan);

               hoadonList.add(hoadon1);
            }
        }
        return hoadonList;
    }
    public int suahoadon(hoadon hoadon){
        SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mahoadon",hoadon.getMahoadon());
        contentValues.put("matheloai",hoadon.getTheloaisach());
        contentValues.put("tensach",hoadon.getTensach());
        contentValues.put("tenkhachhang" ,hoadon.getTenkhachhang());
        contentValues.put("tennhanvien",hoadon.getTennhanvienban());
        contentValues.put("phonekhachhang" ,hoadon.getPhonekhachhang());
        contentValues.put("soluongmua",hoadon.getSoluongsachmua());
        contentValues.put("giaban",hoadon.getGiaban());
        contentValues.put("tongthanhtoan",hoadon.getTongthanhtoan());
        return sqLiteDatabase.update("hoadon",contentValues,"mahoadon=?",new String[]{hoadon.getMahoadon()});
    }
}


