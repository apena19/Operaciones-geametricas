package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Math.PI;

public class Circulo extends AppCompatActivity {
    private EditText radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        radio = findViewById(R.id.txtRadioEs);
    }
    public void Calcular(View v){
        Double resultado;
        String datos, nombre_operacion, radioC ;
        Operacion op;
        nombre_operacion = getString(R.string.lbl_area_circulo);
        radioC = radio.getText().toString();
        datos = getString(R.string.radio) + " " + radioC  ;
        resultado =  PI * ( parseDouble(radioC ) * parseDouble(radioC ) ) ;
        op = new Operacion(nombre_operacion, datos, resultado );
        op.guardar();
        Toast.makeText(this, getString(R.string.mensaje_area) + " " +resultado,Toast.LENGTH_LONG).show();
    }
    public void limpiar(View v){
        radio.setText("");
        radio.requestFocus();
    }
}