package com.example.go_pd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class gofood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);

        final EditText nama = (EditText) findViewById(R.id.etx_nama_food);
        final EditText alamat = (EditText) findViewById(R.id.etx_alamat_food);
        final EditText pesan = (EditText) findViewById(R.id.etx_pesan_food);

        Button button = (Button) findViewById(R.id.btn_order_food);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_food = new Intent(gofood.this, pesanan2.class);
                intent_food.putExtra("nama_food", nama.getText().toString());
                intent_food.putExtra("alamat_food", alamat.getText().toString());
                intent_food.putExtra("pesan_food", pesan.getText().toString());
                startActivity(intent_food);
            }
        });
    }
}
