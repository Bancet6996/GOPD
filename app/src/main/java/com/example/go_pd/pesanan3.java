package com.example.go_pd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class pesanan3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan3);

        TextView nama_ride = (TextView) findViewById(R.id.txt_nama3);
        TextView alamat_ride = (TextView) findViewById(R.id.txt_alamat3);
        TextView pesan_ride = (TextView) findViewById(R.id.txt_pesanan3);

        Bundle bundle = getIntent().getExtras();

        String ride_name = bundle.getString("nama_ride");
        String ride_address = bundle.getString("alamat_ride");
        String ride_order = bundle.getString("pesan_ride");

        nama_ride.setText(ride_name);
        alamat_ride.setText(ride_address);
        pesan_ride.setText(ride_order);
    }
}
