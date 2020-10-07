package com.example.quanlysach.all.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.quanlysach.R;

public class theloaisach extends AppCompatActivity {
    ListView lvtheloai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theloaisach);
        lvtheloai = findViewById(R.id.lvtheloai);
    }
    public void thoat(View view) {
        finish();
    }

    public void updatetheloai(View view) {
        Intent intent = new Intent(this,updatetheloai.class);
        startActivity(intent);
    }

    public void newtheloai(View view) {
        Intent intent = new Intent(this,themtheloai.class);
        startActivity(intent);
    }
}