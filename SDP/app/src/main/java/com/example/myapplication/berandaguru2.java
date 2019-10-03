package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class berandaguru2 extends AppCompatActivity {
    Spinner subjek,kelas;
    Button btnBuatKelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berandaguru2);
        getSupportActionBar().setTitle("Beranda");

        subjek = findViewById(R.id.subjek);
        kelas = findViewById(R.id.kelas);
        btnBuatKelas = findViewById(R.id.btnBuatKelas);

        ArrayList<String> arrSubjek = new ArrayList<>();
        arrSubjek.add("Matematika");
        arrSubjek.add("Fisika");
        arrSubjek.add("Kimia");
        arrSubjek.add("Biologi");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,arrSubjek);
        subjek.setAdapter(arrayAdapter);

        ArrayList<String> arrKelas = new ArrayList<>();
        arrKelas.add("10 IPA");
        arrKelas.add("10 IPS");
        arrKelas.add("11 IPA");
        arrKelas.add("11 IPS");
        arrKelas.add("12 IPS");
        arrKelas.add("12 IPS");

        ArrayAdapter<String> arrayAdapterr = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,arrKelas);
        kelas.setAdapter(arrayAdapterr);

        subjek.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(berandaguru2.this, "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        kelas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(berandaguru2.this, "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btnBuatKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(berandaguru2.this,berandaguru3.class);
                startActivity(moveActivity);
            }
        });
    }
}
