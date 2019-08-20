package com.example.go_pd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class gomart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gomart);

        final EditText nama = (EditText) findViewById(R.id.etx_nama_mart);
        final EditText alamat = (EditText) findViewById(R.id.etx_alamat_mart);
        final EditText pesan = (EditText) findViewById(R.id.etx_pesan_mart);

        Button button = (Button) findViewById(R.id.btn_order_mart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_mart = new Intent(gomart.this, pesanan.class);
                intent_mart.putExtra("nama_mart", nama.getText().toString());
                intent_mart.putExtra("alamat_mart", alamat.getText().toString());
                intent_mart.putExtra("pesan_mart", pesan.getText().toString());
                startActivity(intent_mart);
            }
        });
    }
}
