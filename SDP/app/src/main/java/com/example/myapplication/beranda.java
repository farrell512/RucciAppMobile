package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class beranda extends AppCompatActivity {
    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        btnLogout = findViewById(R.id.btnLogout);
        getSupportActionBar().setTitle("Beranda");

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(beranda.this,MainActivity.class);
                startActivity(moveActivity);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menuBeranda){
            Intent moveActivity = new Intent(beranda.this,beranda.class);
            startActivity(moveActivity);
        }
        else if(item.getItemId() == R.id.menuGrup){
            Intent moveActivity = new Intent(beranda.this,grup.class);
            startActivity(moveActivity);
        }
        else if(item.getItemId() == R.id.menuRiwayat){
            Intent moveActivity = new Intent(beranda.this,riwayat.class);
            startActivity(moveActivity);
        }
        else if(item.getItemId() == R.id.menuGabungKelas){
            Intent moveActivity = new Intent(beranda.this,gabungkelas.class);
            startActivity(moveActivity);
        }
        else if(item.getItemId() == R.id.menuKonsultasi){
            Intent moveActivity = new Intent(beranda.this,beranda.class);
            startActivity(moveActivity);
        }
        else if(item.getItemId() == R.id.menuLatihan){
            Intent moveActivity = new Intent(beranda.this,beranda.class);
            startActivity(moveActivity);
        }
        else if(item.getItemId() == R.id.menuRating){
            Intent moveActivity = new Intent(beranda.this,rating.class);
            startActivity(moveActivity);
        }
        return true;
    }
}
