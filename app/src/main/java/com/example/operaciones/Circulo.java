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
        radio = findViewById(R.id.txtRadioCir);
    }
    public void Calcular(View v){
        if(Validar()){
            Double resultado;
            String datos, nombre_operacion, radioC ;
            Operacion op;
            nombre_operacion = getString(R.string.lbl_area_circulo);
            radioC = radio.getText().toString();
            datos = getString(R.string.radio) + " " + radioC  ;
            String temp;
            temp = String.format("%.2f", PI * ( parseDouble(radioC ) * parseDouble(radioC ) ) );
            resultado =  parseDouble(temp);
            op = new Operacion(nombre_operacion, datos, resultado );
            op.guardar();
            Toast.makeText(this, getString(R.string.mensaje_area) + " " +resultado,Toast.LENGTH_LONG).show();
        }
    }
    public void limpiar(View v){
        radio.setText("");
        radio.requestFocus();
    }
    public Boolean Validar(){
        radio = findViewById(R.id.txtRadioCir);
        if(radio.getText().toString().isEmpty()){
            radio.setError(getString(R.string.error));
            radio.requestFocus();
            return  false;
        }
        return true;
    }
}