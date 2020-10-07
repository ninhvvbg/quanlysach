package com.example.quanlysach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.quanlysach.adapter.adapternguoidung;
import com.example.quanlysach.all.all.quanlynguoidung;
import com.example.quanlysach.database.database;
import com.example.quanlysach.database.nguoidungDAO;
import com.example.quanlysach.model.nguoidung;

import java.util.ArrayList;
import java.util.List;

public class dangky extends AppCompatActivity {
    private  database database;
    EditText edtnguoidung,edttennguoidung,edtsodienthoai,edtuser,edtpass,edtpassnl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       database = new database(null);
        final  nguoidungDAO  nguoidungDAO = new nguoidungDAO(database);

        edtnguoidung = findViewById(R.id.edtnguoidung);
        edttennguoidung = findViewById(R.id.edttennguoidung);
        edtsodienthoai = findViewById(R.id.edtsodienthoai);
        edtuser = findViewById(R.id.edtuser);
        edtpass = findViewById(R.id.edtpass);
        edtpassnl = findViewById(R.id.edtpassnl);
    }

    public void hoanthanhdangky(View view) {
        nguoidung nguoidung1 = new nguoidung();
        String nguoidung = edtnguoidung.getText().toString();
        String tennguoidung = edttennguoidung.getText().toString();
        String sodienthoai = edtsodienthoai.getText().toString();
        String user = edtuser.getText().toString();
        String pass = edtpass.getText().toString();
        String pass2 = edtpassnl.getText().toString();
        nguoidung1.setTennguoidung(nguoidung);
        nguoidung1.setTennguoidung(tennguoidung);
        nguoidung1.setPhone(sodienthoai);
        nguoidung1.setUsername(user);
        nguoidung1.setPass(pass);


    }

//    public void checkEmpty(String data, EditText edt) {
//        if (data.isEmpty()) {
//            edt.setError("Nhap du thong tin...");
//            return;
//        }
//    }

    public void huydangky(View view) {
        finish();
    }
}