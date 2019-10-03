package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class rating extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Rating");

        listview = (ListView) findViewById(R.id.listview);

        final ArrayList<String> arrRating= new ArrayList<>();
        arrRating.add("Christine / Bahasa Inggris");
        arrRating.add("Tadius / Matematika");
        arrRating.add("Weridity Ignatius / Sejarah");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1 ,arrRating);
        listview.setAdapter(arrayAdapter);
        
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent moveActivity = new Intent(rating.this,rating2.class);
                Bundle b = new Bundle();
                b.putString("nama",arrRating.get(i).toString());
                moveActivity.putExtras(b);
                startActivity(moveActivity);
            }
        });

    }
}
