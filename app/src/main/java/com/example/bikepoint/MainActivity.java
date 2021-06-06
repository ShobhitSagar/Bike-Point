package com.example.bikepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    Integer[] imgid = {R.drawable.download, R.drawable.sec_img, R.drawable.download, R.drawable.sec_img, R.drawable.download, R.drawable.download, R.drawable.download};
    String[] names = {"Duke", "Bullet", "Avenger", "Bullet", "Avenger", "Bullet", "Avenger"};
    int[] models = {2019, 2017, 2016, 2017, 2016, 2017, 2016};
    int[] prices = {70000, 90000, 60000, 90000, 60000, 90000, 60000};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter = new MyListAdapter(this, imgid, names, models, prices);
        lv = findViewById(R.id.list_view);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("name", names[i]);
                intent.putExtra("model", models[i]);
                intent.putExtra("price", prices[i]);
                intent.putExtra("img", imgid[i]);
                startActivity(intent);

            }
        });

    }
}



























//
//        bike = findViewById(R.id.bike);
//        nam = findViewById(R.id.name);
//        tim = findViewById(R.id.time);
//        pric = findViewById(R.id.price);
//        n = nam.getText().toString();
//        t = tim.getText().toString();
//        p = pric.getText().toString();
//
//        bike.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
//                intent.putExtra("name", n);
//                intent.putExtra("time", t);
//                intent.putExtra("price", p);
//                startActivity(intent);
//            }
//        });