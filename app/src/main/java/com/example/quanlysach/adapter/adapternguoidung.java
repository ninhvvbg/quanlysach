package com.example.quanlysach.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quanlysach.R;
import com.example.quanlysach.model.nguoidung;

import java.util.ArrayList;
import java.util.List;

public class adapternguoidung extends BaseAdapter {
    private ArrayList<nguoidung> nguoiDunglist;
    private  Context context;
    public adapternguoidung (ArrayList<nguoidung> nguoiDunglist, Context context  ) {
        this.nguoiDunglist = nguoiDunglist;
        this.context = context;

    }

    public adapternguoidung(ArrayList<nguoidung> nguoiDungList) {
        this.nguoiDunglist = nguoiDungList;

    }

    @Override
    public int getCount() {
        return nguoiDunglist.size();
    }

    @Override
    public Object getItem(int i) {
        return nguoiDunglist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.itemnguoidung,viewGroup,false);

        TextView txtma = view.findViewById(R.id.txtmanguoidung);
        TextView txtten = view.findViewById(R.id.txttennguoidung);
        TextView txtphone = view.findViewById(R.id.txtphone);
        TextView txtuser = view.findViewById(R.id.txtuser);
        TextView txtpass = view.findViewById(R.id.txtpass);
        txtma.setText(nguoiDunglist.get(i).getManguoiung());
        txtten.setText(nguoiDunglist.get(i).getTennguoidung());
        txtphone.setText(nguoiDunglist.get(i).getPhone());
        txtuser.setText(nguoiDunglist.get(i).getUsername());
        txtpass.setText(nguoiDunglist.get(i).getPass());

        return view;
    }
}

