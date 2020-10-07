package com.example.quanlysach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dangnhap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
    }

    public void dangnhap(View view) {
        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }

    public void dangky(View view) {
        Intent intent = new Intent(this,dangky.class);
        startActivity(intent);
    }
}