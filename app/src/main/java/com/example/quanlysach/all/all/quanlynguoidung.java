package com.example.quanlysach.all.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.quanlysach.R;
import com.example.quanlysach.adapter.adapternguoidung;
import com.example.quanlysach.database.database;
import com.example.quanlysach.database.nguoidungDAO;
import com.example.quanlysach.model.nguoidung;

import java.util.ArrayList;
import java.util.List;

public class quanlynguoidung extends AppCompatActivity {
    private database database;
    private ListView lvdanhsachnguoidung;
    ArrayList<nguoidung> nguoiDungList;
    adapternguoidung adapternguoidung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanlynguoidung);
        database = new database(this);
        final nguoidungDAO nguoidungDAO = new nguoidungDAO(database);


        lvdanhsachnguoidung = findViewById(R.id.lvdanhsachnguoidung);
        nguoiDungList = nguoidungDAO.getallnguoidung();
        adapternguoidung = new adapternguoidung(nguoiDungList);
        lvdanhsachnguoidung.setAdapter(adapternguoidung);


    }




    public void thoat(View view) {
        finish();
    }

    public void updatenguoidung(View view) {
        Intent intent = new Intent(this,updatenguoidung.class);
        startActivity(intent);
    }

    public void themnguoidung(View view) {
        Intent intent = new Intent(this,themnguoidung.class);
        startActivity(intent);
    }
}