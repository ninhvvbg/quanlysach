package com.example.quanlysach.all.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quanlysach.R;

public class themtheloai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themtheloai);
    }

    public void thoat(View view) {
        finish();
    }

    public void them(View view) {
        Intent intent = new Intent(this,theloaisach.class);
        startActivity(intent);
    }

    public void imgthemtheloai(View view) {
        Intent intent = new Intent(this,theloaisach.class);
        startActivity(intent);
    }
}