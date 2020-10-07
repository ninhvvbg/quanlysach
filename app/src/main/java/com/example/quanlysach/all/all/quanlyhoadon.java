package com.example.quanlysach.all.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.quanlysach.R;

public class quanlyhoadon extends AppCompatActivity {
    ListView lvhoadon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanlyhoadon);
    }

    public void newhoadon(View view) {
        Intent intent = new Intent(this,themhoadon.class);
        startActivity(intent);
    }

    public void updatehoadon(View view) {
        Intent intent = new Intent(this,updatehoadon.class);
        startActivity(intent);

    }
}