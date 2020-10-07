package com.example.quanlysach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quanlysach.all.all.quanlyhoadon;
import com.example.quanlysach.all.all.quanlynguoidung;
import com.example.quanlysach.all.all.quanlysach;
import com.example.quanlysach.all.all.theloaisach;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void nguoidung(View view) {
        Intent intent = new Intent(home.this, quanlynguoidung.class);
        startActivity(intent);
    }

    public void sach(View view) {
        Intent intent = new Intent(home.this, quanlysach.class);
        startActivity(intent);
    }

    public void hoadon(View view) {
        Intent intent = new Intent(home.this, quanlyhoadon.class);
        startActivity(intent);
    }

    public void theloaisach(View view) {
        Intent intent = new Intent(home.this, theloaisach.class);
        startActivity(intent);
    }
}