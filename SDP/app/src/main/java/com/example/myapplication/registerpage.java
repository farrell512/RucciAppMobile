package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class registerpage extends AppCompatActivity {
    Button btnBuatAkun;
    RadioButton radioGuru,radioMurid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);

        getSupportActionBar().setTitle("RUCCI");

        btnBuatAkun = findViewById(R.id.btnBuatAkun);
        radioGuru = findViewById(R.id.radioGuru);
        radioMurid = findViewById(R.id.radioMurid);


        btnBuatAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(radioGuru.isChecked()){
                Intent moveActivity = new Intent(registerpage.this,berandaguru.class);
                startActivity(moveActivity);
            }
            else if(radioMurid.isChecked()){
                Intent moveActivity = new Intent(registerpage.this,beranda.class);
                startActivity(moveActivity);
            }
            }
        });

    }
}
