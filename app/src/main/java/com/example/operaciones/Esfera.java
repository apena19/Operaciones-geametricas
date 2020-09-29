package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Math.PI;

public class Esfera extends AppCompatActivity {
    private EditText radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        radio = findViewById(R.id.txtRadioEs);
    }
    public void Calcular(View v){
        Double resultado;
        String datos, nombre_operacion, radioC ;
        Operacion op;
        nombre_operacion = getString(R.string.lbl_vol_esfera);
        radioC = radio.getText().toString();
        datos = getString(R.string.radio) + " " + radioC  ;
        resultado = ( 4 * PI * Math.pow( parseDouble(radioC ), 3 ) ) / 3;
        op = new Operacion(nombre_operacion, datos, resultado );
        op.guardar();
        Toast.makeText(this, getString(R.string.mensaje_volumen) + " " +resultado,Toast.LENGTH_LONG).show();
    }
    public void limpiar(View v){
        radio.setText("");
        radio.requestFocus();
    }
}