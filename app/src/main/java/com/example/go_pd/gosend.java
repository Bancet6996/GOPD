package com.example.go_pd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class gosend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gosend);

        final EditText nama = (EditText) findViewById(R.id.etx_nama_send);
        final EditText alamat = (EditText) findViewById(R.id.etx_alamat_send);
        final EditText pesan = (EditText) findViewById(R.id.etx_pesan_send);

        Button button = (Button) findViewById(R.id.btn_order_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_send = new Intent(gosend.this, pesanan4.class);
                intent_send.putExtra("nama_send", nama.getText().toString());
                intent_send.putExtra("alamat_send", alamat.getText().toString());
                intent_send.putExtra("pesan_send", pesan.getText().toString());
                startActivity(intent_send);
            }
        });
    }
}
