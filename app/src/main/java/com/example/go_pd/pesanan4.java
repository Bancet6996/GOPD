package com.example.go_pd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class pesanan4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan4);

        TextView nama_send = (TextView) findViewById(R.id.txt_nama4);
        TextView alamat_send = (TextView) findViewById(R.id.txt_alamat4);
        TextView pesan_send = (TextView) findViewById(R.id.txt_pesanan4);

        Bundle bundle = getIntent().getExtras();

        String send_name = bundle.getString("nama_send");
        String send_address = bundle.getString("alamat_send");
        String send_order = bundle.getString("pesan_send");

        nama_send.setText(send_name);
        alamat_send.setText(send_address);
        pesan_send.setText(send_order);
    }
}
