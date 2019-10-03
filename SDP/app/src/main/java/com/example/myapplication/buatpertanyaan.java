package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class buatpertanyaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buatpertanyaan);

        getSupportActionBar().setTitle("Buat Pertanyaan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
