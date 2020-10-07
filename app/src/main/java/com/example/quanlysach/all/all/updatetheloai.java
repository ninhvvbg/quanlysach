package com.example.quanlysach.all.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.quanlysach.R;

public class updatetheloai extends AppCompatActivity {
    EditText edtmatheloaitim,edttentheloai,edtvitritheloai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatetheloai);
    }

    public void imgtheloai(View view) {
        Intent intent = new Intent(this,theloaisach.class);
        startActivity(intent);
    }

    public void timtheloai(View view) {

    }

    public void update(View view) {
        Intent intent = new Intent(this,theloaisach.class);
        startActivity(intent);
    }

    public void huy(View view) {
        finish();
    }
}