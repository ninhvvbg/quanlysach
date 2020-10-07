package com.example.quanlysach.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quanlysach.R;
import com.example.quanlysach.model.hoadon;

import java.util.ArrayList;

public class adapterhoadon extends BaseAdapter {
    private ArrayList<hoadon> hoadonlist;
    private Context context;

    public adapterhoadon(ArrayList<hoadon> hoadonlist,Context context){
        this.hoadonlist = hoadonlist;
        this.context = context;
    }

    @Override
    public int getCount() {
        return hoadonlist.size();
    }

    @Override
    public Object getItem(int i) {
        return hoadonlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.itemhoadon,viewGroup,false);

        TextView txtmahoadon = view.findViewById(R.id.txtmahoadon);
        TextView txttensach = view.findViewById(R.id.txttensach);
        TextView txtsoluong = view.findViewById(R.id.txtsoluong);
        TextView txtthanhtoan = view.findViewById(R.id.txtthanhtoan);
        ImageView imgxoa = view.findViewById(R.id.imgxoa);

        txtmahoadon.setText(hoadonlist.get(i).getMahoadon());
        txttensach.setText(hoadonlist.get(i).getTensach());
        txtsoluong.setText(hoadonlist.get(i).getSoluongsachmua());
        txtthanhtoan.setText(hoadonlist.get(i).getTongthanhtoan());
        imgxoa.setImageResource(getCount());

        return view;
    }

}
