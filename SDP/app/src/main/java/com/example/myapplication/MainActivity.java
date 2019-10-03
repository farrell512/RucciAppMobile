package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnKlikDisini,btnMasuk;
    EditText inputEmail, inputPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnKlikDisini = findViewById(R.id.btnKlikDisini);
        btnMasuk = findViewById(R.id.btnMasuk);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);

        getSupportActionBar().setTitle("RUCCI");

        btnKlikDisini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(MainActivity.this,registerpage.class);
                startActivity(moveActivity);
            }
        });
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputEmail.getText().toString() == "murid"){
                    Intent moveActivity = new Intent(MainActivity.this, beranda.class);
                    startActivity(moveActivity);
                }
                else if(inputPassword.getText().toString() == "guru"){
                    Intent moveActivity = new Intent(MainActivity.this, berandaguru.class);
                    startActivity(moveActivity);
                }
            }
        });
    }
}
