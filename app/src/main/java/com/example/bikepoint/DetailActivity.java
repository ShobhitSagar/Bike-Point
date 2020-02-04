package com.example.bikepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView bname, timing, bprice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        bname = findViewById(R.id.bike_name);
        timing = findViewById(R.id.timing);
        bprice = findViewById(R.id.bike_price);
        String na = getIntent().getStringExtra("name");
        String ti = getIntent().getStringExtra("time");
        String pr = getIntent().getStringExtra("price");

        bname.setText(na);
        timing.setText(ti);
        bprice.setText(pr);
    }
}
