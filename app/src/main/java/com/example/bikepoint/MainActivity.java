package com.example.bikepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout bike;
    TextView nam, tim, pric;
    String n, t, p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bike = findViewById(R.id.bike);
        nam = findViewById(R.id.name);
        tim = findViewById(R.id.time);
        pric = findViewById(R.id.price);
        n = nam.getText().toString();
        t = tim.getText().toString();
        p = pric.getText().toString();

        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("name", n);
                intent.putExtra("time", t);
                intent.putExtra("price", p);
                startActivity(intent);
            }
        });
    }
}
