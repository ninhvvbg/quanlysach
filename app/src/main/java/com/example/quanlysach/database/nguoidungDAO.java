package com.example.quanlysach.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlysach.model.nguoidung;

import java.util.ArrayList;
import java.util.List;

public class nguoidungDAO{
    private  database database;

    public nguoidungDAO(database database) {
        this.database = database;
    }
    public boolean themnguoidung(nguoidung nguoidung){
        // xin quyền
        // ghép cặp giá trị với tên cột
        // ogji câu lệnh insert và kiểm tra
        SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
//        if (checkuser(nguoidung.username >0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("username", nguoidung.getUsername());
            contentValues.put("tennguoidung", nguoidung.getTennguoidung());
            contentValues.put("phone", nguoidung.getPhone());
            contentValues.put("pass", nguoidung.getPass());

            long  kq = sqLiteDatabase.insert("nguoidung", null, contentValues);
        if (kq > 0) return true;
        else return false;
//        }


    }

    public void xoanguoidung(String username){
        SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
        sqLiteDatabase.delete("nguoidung","username=?",new String[]{username});
    }
    public ArrayList<nguoidung> getallnguoidung(){
        ArrayList<nguoidung> nguoidungList = new ArrayList<>();
        String truyvan = "SELECT * FROM nguoidung";
        Cursor cursor = database.getWritableDatabase().rawQuery(truyvan,null);
        if (cursor.getCount()>0){
            cursor.moveToFirst();
            while (cursor.isAfterLast() == false){
                String username = cursor.getString(cursor.getColumnIndex("username"));
                String tennguoidung = cursor.getString(cursor.getColumnIndex("tennguoidung"));
                String phone = cursor.getString(cursor.getColumnIndex("phone"));
                String pass = cursor.getString(cursor.getColumnIndex("pass"));

                nguoidung nguoidung1 = new nguoidung();
                nguoidung1.setUsername(username);
                nguoidung1.setTennguoidung(tennguoidung);
                nguoidung1.setPhone(phone);
                nguoidung1.setPass(pass);
                nguoidungList.add(nguoidung1);

            }
        }
        return nguoidungList;
    }
    public int suanguoidung(nguoidung nguoidung){
        SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",nguoidung.getUsername());
        contentValues.put("tennguoidung",nguoidung.getTennguoidung());
        contentValues.put("phone",nguoidung.getPhone());
        contentValues.put("pass" , nguoidung.getPass());
        return sqLiteDatabase.update("nguoidung",contentValues,"username=?",new String[]{nguoidung.getUsername()});
    }
//    public int checkuser (String username){
//        // kiểm tra user tồn tại hay chưa
//
//        String compa = " SELECT * FROM username WHERE username='"+ username + "'";
//        Log.e("CAU LENH", compa);
//        Cursor cursor = sqLiteDatabase.rawQuery(compa,null);
//        if (cursor.getCount()>0){
//            return 1;
//        }else {
//            return -1;
//        }
//    }
}
