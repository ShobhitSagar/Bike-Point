package com.example.bikepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView bname, timing, bprice;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = findViewById(R.id.image);
        bname = findViewById(R.id.bike_name);
        timing = findViewById(R.id.timing);
        bprice = findViewById(R.id.bike_price);
        String na = getIntent().getStringExtra("name");
        int ti = getIntent().getIntExtra("model", 0);
        int pr = getIntent().getIntExtra("price", 0);
        int im = getIntent().getIntExtra("img", 0);

        bname.setText(na);
        timing.setText(String.valueOf(ti));
        bprice.setText(String.valueOf(pr));
        img.setImageResource(im);
    }
}
