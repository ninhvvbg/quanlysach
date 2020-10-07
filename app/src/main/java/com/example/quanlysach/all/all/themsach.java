package com.example.quanlysach.all.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.quanlysach.R;
import com.example.quanlysach.adapter.adaptersach;
import com.example.quanlysach.database.database;
import com.example.quanlysach.database.sachDAO;
import com.example.quanlysach.model.sach;

import java.util.ArrayList;

public class themsach extends AppCompatActivity {
//    private database database;
    sachDAO sachDAO;
    EditText edtmabarcode,edttensach,edtnhaxuatban,edttacgia,edttentheloai,edtsoluongsach,edtgiaban;
    private ArrayList<sach> sachlist;
    private adaptersach adaptersach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themsach);
//        database = new database(this);
        sachDAO = new sachDAO(this);


        edtmabarcode = findViewById(R.id.edtmabarcode);
        edttensach = findViewById(R.id.edttensach);
        edtnhaxuatban = findViewById(R.id.edtnhaxuatban);
        edttacgia = findViewById(R.id.edttacgia);
        edttentheloai = findViewById(R.id.edttentheloai);
        edtsoluongsach = findViewById(R.id.edtsoluongsach);
        edtgiaban = findViewById(R.id.edtgiaban);
    }

    public void newnow(View view) {
        sach sach = new sach();
        String masach = edtmabarcode.getText().toString();
        String tensach = edttensach.getText().toString();
        String nhaxuatban = edtnhaxuatban.getText().toString();
        String tacgia= edttacgia.getText().toString();
        String tentheloai = edttentheloai.getText().toString();
        String soluong = edtsoluongsach.getText().toString();
        String giaban = edtgiaban.getText().toString();

        sach.setMabarcode(masach);
        sach.setTensach(tensach);
        sach.setNhaxuatban(nhaxuatban);
        sach.setTacgia(tacgia);
        sach.setTheloai(tentheloai);
        sach.setSoluong(soluong);
        sach.setGiaban(giaban);
        sachDAO = new sachDAO(this);
        boolean ketqua = sachDAO.themsach(sach);
        if (ketqua){
            Toast.makeText(this,"thêm sách thành công ",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,quanlysach.class);
            startActivity(intent);
        }else {
            Toast.makeText(this,"thêm sach thất bại cần xem lại gấp " , Toast.LENGTH_LONG).show();
        }

    }

    public void huy(View view) {
        finish();
    }
}