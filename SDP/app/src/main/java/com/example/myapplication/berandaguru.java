package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class berandaguru extends AppCompatActivity {
    Button btnBuatKelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berandaguru);

        btnBuatKelas = findViewById(R.id.btnBuatKelas);

        btnBuatKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(berandaguru.this,berandaguru2.class);
                startActivity(moveActivity);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuguru,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menuBeranda){

        }
        else if(item.getItemId() == R.id.menuChatting){

        }
        else if(item.getItemId() == R.id.menuBuatPertanyaan){
            Intent moveActivity = new Intent(berandaguru.this,buatpertanyaan.class);
            startActivity(moveActivity);
        }
        else if(item.getItemId() == R.id.menuKelasPrivat){

        }
        else if(item.getItemId() == R.id.menuBonus){

        }
        return true;
    }
}
