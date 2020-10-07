package com.example.quanlysach.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quanlysach.R;
import com.example.quanlysach.model.sach;

import java.util.ArrayList;

public class adaptersach extends BaseAdapter {
    private ArrayList<sach> sachlist;
    private Context context;
    public adaptersach(ArrayList<sach> sachlist,Context context){
        this.sachlist = sachlist;
        this.context = context;
    }
    @Override
    public int getCount() {
        return sachlist.size();
    }

    @Override
    public Object getItem(int i) {
        return sachlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.itemsach,viewGroup,false);


        TextView txtmabarcode = view.findViewById(R.id.txtmabarcode);
        TextView txttensach = view.findViewById(R.id.txttensach);
        TextView txttheloai = view.findViewById(R.id.txttheloai);
        TextView txtsoluong = view.findViewById(R.id.txtsoluong);

        txtmabarcode.setText(sachlist.get(i).getMabarcode());
        txttensach.setText(sachlist.get(i).getTensach());
        txtsoluong.setText(sachlist.get(i).getSoluong());
        txttheloai.setText(sachlist.get(i).getTheloai());

        return view;
    }
}
