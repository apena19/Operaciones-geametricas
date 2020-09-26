package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Volumenes extends AppCompatActivity {
    private ListView lst_volumnes;
    private String[] volumnes_string;
    private ArrayAdapter<String> adapter;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes);
        lst_volumnes = findViewById(R.id.lstVolumenes);
        volumnes_string = getResources().getStringArray(R.array.opcionesVolumnes);
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, volumnes_string);
        lst_volumnes.setAdapter(adapter);
    }
}