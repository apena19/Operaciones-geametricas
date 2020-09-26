package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Areas extends AppCompatActivity {
    private ListView lst_areas;
    private String[] areas_string;
    private ArrayAdapter<String> adapter;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);
        lst_areas = findViewById(R.id.lstAreas);
        areas_string = getResources().getStringArray(R.array.opcionesAreas);
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, areas_string);
        lst_areas.setAdapter(adapter);
    }
}