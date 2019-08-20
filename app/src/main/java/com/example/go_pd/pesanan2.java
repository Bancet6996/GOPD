package com.example.go_pd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class pesanan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan2);

        TextView nama_food = (TextView) findViewById(R.id.txt_nama2);
        TextView alamat_food = (TextView) findViewById(R.id.txt_alamat2);
        TextView pesan_food = (TextView) findViewById(R.id.txt_pesanan2);

        Bundle bundle = getIntent().getExtras();

        String food_name = bundle.getString("nama_food");
        String food_address = bundle.getString("alamat_food");
        String food_order = bundle.getString("pesan_food");

        nama_food.setText(food_name);
        alamat_food.setText(food_address);
        pesan_food.setText(food_order);
    }
}
