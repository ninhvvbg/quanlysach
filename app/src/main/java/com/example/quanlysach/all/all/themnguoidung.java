package com.example.quanlysach.all.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.quanlysach.R;
import com.example.quanlysach.dangnhap;
import com.example.quanlysach.database.database;
import com.example.quanlysach.database.nguoidungDAO;
import com.example.quanlysach.model.nguoidung;

import java.util.ArrayList;
import java.util.List;

public class themnguoidung extends AppCompatActivity {
    private  database database;
 ArrayList<nguoidung> nguoidungs;
    EditText edtmanguoidung,edthotennguoidung,edtsodienthoainguoidung,edtusernguoidung,edtpassnguoidung,edtpassnguoidunglan2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themnguoidung);
        database = new database(this);
        final nguoidungDAO nguoidungDAO = new nguoidungDAO(database);

        edtmanguoidung = findViewById(R.id.edtmanguoidung);
        edthotennguoidung = findViewById(R.id.edthotennguoidung);
        edtsodienthoainguoidung = findViewById(R.id.edtsodienthoainguoidung);
        edtusernguoidung = findViewById(R.id.edtusernguoidung);
        edtpassnguoidung = findViewById(R.id.edtpassnguoidung);
        edtpassnguoidunglan2 = findViewById(R.id.edtpassnguoidunglan2);
    }

    public void dangkynguoidung(View view) {
        nguoidung nguoidungs = new nguoidung();
        String manguoidung = edtmanguoidung.getText().toString();
        String hotennguoidung = edthotennguoidung.getText().toString();
        String sodienthoainguoidung = edtsodienthoainguoidung.getText().toString();
        String edtuser = edtusernguoidung.getText().toString();
        String pass = edtpassnguoidung.getText().toString();
        String pass2 = edtpassnguoidunglan2.getText().toString();

        nguoidungs.setManguoiung(manguoidung);
        nguoidungs.setTennguoidung(hotennguoidung);
        nguoidungs.setPhone(sodienthoainguoidung);
        nguoidungs.setUsername(edtuser);
        nguoidungs.setPass(pass);
        nguoidungs.setPass(pass2);

        nguoidungDAO nguoidungDAO = new nguoidungDAO(database);
        boolean ketqua = nguoidungDAO.themnguoidung(nguoidungs);
        if (ketqua) {
            Toast.makeText(themnguoidung.this,
                    "THANH CONG!!!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, quanlynguoidung.class);
            startActivity(intent);


//            List<nguoidung> nguoiDungList = nguoidungDAO.getallnguoidung();
//            adpter nguoiDungAdapter = new NguoiDungAdapter(nguoiDungList);
//            listView.setAdapter(nguoiDungAdapter);
        } else {
            Toast.makeText(themnguoidung.this,
                    "KHONG THANH CONG!!!", Toast.LENGTH_SHORT).show();
        }

    }


//       if (manguoidung.equals("") && hotennguoidung.equals("")&& sodienthoainguoidung.equals("") && edtuser.equals("")&&pass.equals("") && pass2.equals("")){
//            long check = nguoidungDAO.themnguoidung(nguoidungs);
//            if (check == -1 ){
//                Toast.makeText(this,"thêm thất bại mã người dùng đã tồn tại ",Toast.LENGTH_LONG).show();
//            }else if (pass.equals("")&pass2.equals(pass)){
//               Toast.makeText(this,"Nhập lại mật khẩu như trên",Toast.LENGTH_LONG).show();
//            }
//            Toast.makeText(this,"thêm người dùng thành công " , Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this,dangnhap.class);
//            startActivity(intent);
//       }



    public void huydangkynguoidung(View view) {
        finish();
    }

    public void imgthemnguoidung(View view) {
        Intent intent = new Intent(this,quanlynguoidung.class);
        startActivity(intent);
    }
}