package com.example.bikepoint;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {


    private final Activity context;
    private final Integer[] imgid;
    private final String[] name;
    private final int[] modle;
    private final int[] price;

    public MyListAdapter(Activity context, Integer[] imgid, String[] name, int[] modle, int[] price) {
        super(context, R.layout.mylistview, name);

        this.context = context;
        this.imgid = imgid;
        this.name = name;
        this.modle = modle;
        this.price = price;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylistview, null, true);


        TextView nam, mod, pric;
        ImageView im;

        im = rowView.findViewById(R.id.img);
        nam = rowView.findViewById(R.id.name);
        mod = rowView.findViewById(R.id.time);
        pric = rowView.findViewById(R.id.price);


        nam.setText(name[position]);
        pric.setText(String.valueOf(price[position]));
        im.setImageResource(imgid[position]);
        mod.setText(String.valueOf(modle[position]));

        return rowView;

    };
}
