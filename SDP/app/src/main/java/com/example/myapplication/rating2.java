package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ActionMenuView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class rating2 extends AppCompatActivity {
    ListView listview;
    TextView tvNamaDosen;
    String nama="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Rating");

        listview = findViewById(R.id.listview);
        tvNamaDosen = findViewById(R.id.tvNamaDosen);

        Intent terima = getIntent();
        nama = terima.getStringExtra("nama");
        nama = nama.substring(0,nama.indexOf("/"));
        tvNamaDosen.setText(nama);
    }
}
