package com.example.go_pd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class goride extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goride);

        final EditText nama = (EditText) findViewById(R.id.etx_nama_ride);
        final EditText alamat = (EditText) findViewById(R.id.etx_alamat_ride);
        final EditText pesan = (EditText) findViewById(R.id.etx_pesan_ride);

        Button button = (Button) findViewById(R.id.btn_order_ride);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ride = new Intent(goride.this, pesanan3.class);
                intent_ride.putExtra("nama_ride", nama.getText().toString());
                intent_ride.putExtra("alamat_ride", alamat.getText().toString());
                intent_ride.putExtra("pesan_ride", pesan.getText().toString());
                startActivity(intent_ride);
            }
        });
    }
}
