package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gabungkelas extends AppCompatActivity {
    Button btnGabungKelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gabungkelas);
        getSupportActionBar().setTitle("Gabung Kelas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnGabungKelas = findViewById(R.id.btnGabungKelas);

        btnGabungKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }
}
