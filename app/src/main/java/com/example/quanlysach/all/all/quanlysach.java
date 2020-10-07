package com.example.quanlysach.all.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.quanlysach.R;
import com.example.quanlysach.adapter.adaptersach;
import com.example.quanlysach.database.database;
import com.example.quanlysach.database.sachDAO;
import com.example.quanlysach.model.sach;

import java.util.ArrayList;

public class quanlysach extends AppCompatActivity {
    ListView lvsach;
//    private database database;
    sachDAO sachDAO;
    ArrayList<sach> sachs;
    adaptersach adaptersach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanlysach);
        lvsach = findViewById(R.id.lvsach);
//        database = new database(this);
        sachDAO = new sachDAO(this);
        sachs = (ArrayList<sach>) sachDAO.getallsach();
        adaptersach = new adaptersach(sachs,this);
        lvsach.setAdapter(adaptersach);

    }

    public void newsach(View view) {
        Intent intent = new Intent(this,themsach.class);
        startActivity(intent);
    }

    public void updatesach(View view) {
        Intent intent = new Intent(this,updatesach.class);
        startActivity(intent);
    }
}