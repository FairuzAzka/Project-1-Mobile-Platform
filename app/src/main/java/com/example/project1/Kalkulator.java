package com.example.project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends Activity {
    EditText bilangan1, bilangan2;
    Button btntambah, btnkurang, btnkali, btnbagi, btnkembali;
    TextView txthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        bilangan1 = (EditText) findViewById(R.id.bilangan1);
        bilangan2 = (EditText) findViewById(R.id.bilangan2);
        txthasil = (TextView) findViewById(R.id.txthasil);
        btntambah = (Button) findViewById(R.id.btntambah);
        btnkurang = (Button) findViewById(R.id.btnkurang);
        btnkali = (Button) findViewById(R.id.btnkali);
        btnbagi = (Button) findViewById(R.id.btnbagi);

        View.OnClickListener kembali = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btnkembali:finish();break;
                }
            }
        };

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(bilangan1.getText().toString());
                int nilaiB = Integer.parseInt(bilangan2.getText().toString());
                int hasil = nilaiA + nilaiB;
                txthasil.setText(String.valueOf(hasil));
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(bilangan1.getText().toString());
                int nilaiB = Integer.parseInt(bilangan2.getText().toString());
                int hasil = nilaiA - nilaiB;
                txthasil.setText(String.valueOf(hasil));
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(bilangan1.getText().toString());
                int nilaiB = Integer.parseInt(bilangan2.getText().toString());
                int hasil = nilaiA * nilaiB;
                txthasil.setText(String.valueOf(hasil));
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(bilangan1.getText().toString());
                int nilaiB = Integer.parseInt(bilangan2.getText().toString());
                int hasil = nilaiA / nilaiB;
                txthasil.setText(String.valueOf(hasil));
            }
        });



    }
}
