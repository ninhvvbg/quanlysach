package com.example.quanlysach.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlysach.model.theloai;

import java.util.ArrayList;
import java.util.List;

public class theloaiDAO  {
    private  database database;
    public theloaiDAO(database database){
        this.database = database;
    }
    public long themtheloai(theloai theloai){
        SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("matheloai",theloai.getMatheloai());
        contentValues.put("tentheloai",theloai.getTentheloai());

        return sqLiteDatabase.insert("theloai",null,contentValues);

    }
    public void xoatheloai(String matheloai){
        SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
        sqLiteDatabase.delete("theloai","matheloai=?",new String[]{matheloai});
    }
    public List<theloai> getalltheloai(){
        List<theloai> theloaiList = new ArrayList<>();
        String truyvan = "SELECT * FROM theloai";
        Cursor cursor = database.getWritableDatabase().rawQuery(truyvan,null);
        if (cursor.getCount()>0){
            cursor.moveToFirst();
            while (cursor.isAfterLast() == false){
                String matheloai = cursor.getString(cursor.getColumnIndex("matheloai"));
                String tentheloai = cursor.getString(cursor.getColumnIndex("tentheloai"));

                theloai theloai1 = new theloai();
                theloai1.setMatheloai(matheloai);
                theloai1.setTentheloai(tentheloai);
                theloaiList.add(theloai1);
            }
        }
        return theloaiList;
    }
    public int suatheloai(theloai theloai){
        SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("matheloai",theloai.getMatheloai());
        contentValues.put("tentheloai",theloai.getTentheloai());
        return sqLiteDatabase.update("theloai",contentValues,"matheloai=?",new String[]{theloai.getMatheloai()});


    }
}
