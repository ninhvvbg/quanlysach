package com.example.quanlysach.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quanlysach.R;
import com.example.quanlysach.model.theloai;

import java.util.ArrayList;

public class adaptertheloai extends BaseAdapter {
    private ArrayList<theloai> theloais;
    private Context context;

    public adaptertheloai(ArrayList<theloai> theloais, Context context) {
        this.theloais = theloais;
        this.context = context;
    }

    @Override
    public int getCount() {
        return theloais.size();
    }

    @Override
    public Object getItem(int i) {
        return theloais.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.itemtheloai,viewGroup,false);
        TextView txtmatheloai = view.findViewById(R.id.txtmatheloai);
        TextView txttentheloai = view.findViewById(R.id.txttentheloai);
        TextView txtvitri = view.findViewById(R.id.txtvitri);

        txtmatheloai.setText(theloais.get(i).getMatheloai());
        txttentheloai.setText(theloais.get(i).getTentheloai());
        txtvitri.setText(theloais.get(i).getVitri());

        return view;
    }
}
