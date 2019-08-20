package com.example.go_pd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public ImageButton btn_mart, btn_ride, btn_food, btn_send;
    TextView nama_mart, alamat_mart, pesanan_mart;
    TextView nama_ride, alamat_ride, pesanan_ride;
    TextView nama_food, alamat_food, pesanan_food;
    TextView nama_send, alamat_send, pesanan_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_mart = (ImageButton) findViewById(R.id.go_mart);
        btn_mart.setOnClickListener(this);

        btn_ride = (ImageButton) findViewById(R.id.go_ride);
        btn_ride.setOnClickListener(this);

        btn_food = (ImageButton) findViewById(R.id.go_food);
        btn_food.setOnClickListener(this);

        btn_send = (ImageButton) findViewById(R.id.go_send);
        btn_send.setOnClickListener(this);

        nama_mart = findViewById(R.id.nama_mart);
        alamat_mart = findViewById(R.id.alamat_mart);
        pesanan_mart = findViewById(R.id.pesan_mart);

        nama_ride = findViewById(R.id.nama_ride);
        alamat_ride = findViewById(R.id.alamat_ride);
        pesanan_ride = findViewById(R.id.pesan_ride);

        nama_food = findViewById(R.id.nama_food);
        alamat_food = findViewById(R.id.alamat_food);
        pesanan_food = findViewById(R.id.pesan_food);

        nama_send = findViewById(R.id.nama_send);
        alamat_send = findViewById(R.id.alamat_send);
        pesanan_send = findViewById(R.id.pesan_send);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.go_mart:
                Intent intent_mart = new Intent(MainActivity.this, gomart.class);
                startActivity(intent_mart);
                break;
            case R.id.go_ride:
                Intent intent_ride = new Intent(MainActivity.this, goride.class);
                startActivity(intent_ride);
                break;
            case R.id.go_food:
                Intent intent_food = new Intent(MainActivity.this, gofood.class);
                startActivity(intent_food);
                break;
            case R.id.go_send:
                Intent intent_send = new Intent(MainActivity.this, gosend.class);
                startActivity(intent_send);
                break;
        }
    }
}
