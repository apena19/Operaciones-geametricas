package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Math.PI;

public class Cubo extends AppCompatActivity {
    private EditText arista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        arista = findViewById(R.id.txtArista);
    }
    public void Calcular(View v){
        Double resultado;
        String datos, nombre_operacion, arista_t ;
        Operacion op;
        nombre_operacion = getString(R.string.lbl_vol_cubo);
        arista_t = arista.getText().toString();
        datos = getString(R.string.lbl_arista) + " " + arista_t  ;
        resultado =  Math.pow( parseDouble(arista_t ), 3) ;
        op = new Operacion(nombre_operacion, datos, resultado );
        op.guardar();
        Toast.makeText(this, getString(R.string.mensaje_volumen) + " " +resultado,Toast.LENGTH_LONG).show();
    }
    public void limpiar(View v){
        arista.setText("");
        arista.requestFocus();
    }
}