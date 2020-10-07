package com.example.quanlysach.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlysach.model.sach;

import java.util.ArrayList;
import java.util.List;

public class sachDAO extends database {
    public sachDAO(Context context){
        super(context);
    }
    public boolean themsach(sach sach){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("masach",sach.getMabarcode());
        contentValues.put("tensach",sach.getTensach());
        contentValues.put("matheloai",sach.getTheloai());
        contentValues.put("tacgia",sach.getTacgia());
        contentValues.put("NXB",sach.getNhaxuatban());
        contentValues.put("giasach",sach.getGiaban());
        contentValues.put("soluong",sach.getSoluong());

       long kq = sqLiteDatabase.insert("sach",null,contentValues);

        if (kq > 0) return true;
        else return false;
    }
    public void xoasach(String masach){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.delete("sach","masach=?",new String[]{masach});
    }
    public List<sach> getallsach(){
        List<sach> sachList  = new ArrayList<>();
        String truyvan = "SELECT * FROM sach";
        Cursor cursor = this.getWritableDatabase().rawQuery(truyvan,null);
        if (cursor.getCount()>0){
            cursor.moveToFirst();
            while (cursor.isAfterLast() == false){
                String masach = cursor.getString(cursor.getColumnIndex("masach"));
                String tensach = cursor.getString(cursor.getColumnIndex("tensach"));
                String matheloai = cursor.getString(cursor.getColumnIndex("matheloai"));
                String tacgia = cursor.getString(cursor.getColumnIndex("tacgia"));
                String nxb = cursor.getString(cursor.getColumnIndex("NXB"));
                String giasach = cursor.getString(cursor.getColumnIndex("giasach"));
                String soluong = cursor.getString(cursor.getColumnIndex("soluong"));

               sach sach1 = new sach();
               sach1.setMabarcode(masach);
               sach1.setTensach(tensach);
               sach1.setTheloai(matheloai);
               sach1.setTacgia(tacgia);
               sach1.setNhaxuatban(nxb);
               sach1.setGiaban(giasach);
               sach1.setSoluong(soluong);

               sachList.add(sach1);
            }
        }
        return sachList;
    }
    public int suasach(sach sach){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("masach",sach.getMabarcode());
        contentValues.put("tensach",sach.getTensach());
        contentValues.put("matheloai",sach.getTheloai());
        contentValues.put("tacgia" , sach.getTacgia());
        contentValues.put("NXB",sach.getNhaxuatban());
        contentValues.put("giasach" ,sach.getGiaban());
        contentValues.put("soluong",sach.getSoluong());
        return sqLiteDatabase.update("sach",contentValues,"masach=?",new String[]{sach.getMabarcode()});
    }
}
