package com.example.go_pd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class pesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        TextView nama_mart = (TextView) findViewById(R.id.txt_nama);
        TextView alamat_mart = (TextView) findViewById(R.id.txt_alamat);
        TextView pesan_mart = (TextView) findViewById(R.id.txt_pesanan);

        Bundle bundle = getIntent().getExtras();

        String mart_name = bundle.getString("nama_mart");
        String mart_address = bundle.getString("alamat_mart");
        String mart_order = bundle.getString("pesan_mart");

        nama_mart.setText(mart_name);
        alamat_mart.setText(mart_address);
        pesan_mart.setText(mart_order);
    }
}
