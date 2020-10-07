package com.example.quanlysach.all.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.quanlysach.R;

public class updatenguoidung extends AppCompatActivity {
    EditText edtmaupdate, edthotennguoidungupdate,edtsodienthoainguoidungupdate,edtpassnguoidungupdate,edtpassnguoidungx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatenguoidung);
        edtmaupdate = findViewById(R.id.edtmaupdate);
        edthotennguoidungupdate =findViewById(R.id.edthotennguoidungupdate);
        edtsodienthoainguoidungupdate = findViewById(R.id.edtsodienthoainguoidungupdate);
        edtpassnguoidungupdate = findViewById(R.id.edtpassnguoidungupdate);
        edtpassnguoidungx2 = findViewById(R.id.edtpassnguoidungx2);
    }

    public void tim(View view) {

    }

    public void updateuser(View view) {

    }

    public void huyupdate(View view) {
        finish();
    }
    public void imgupdate(View view) {
        Intent intent = new Intent(this,quanlynguoidung.class);
        startActivity(intent);
    }
}