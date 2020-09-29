package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Math.PI;

public class Cono extends AppCompatActivity {
    private EditText radio,altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);

        radio = findViewById(R.id.txtAlturaCono);
        altura = findViewById(R.id.txtRadioCono);
    }
    public void Calcular(View v){
        if(Validar()){
            Double resultado;
            String datos, nombre_operacion, radio_t, altura_t ;
            Operacion op;
            nombre_operacion = getString(R.string.lbl_vol_cono);
            radio_t = radio.getText().toString();
            altura_t = altura.getText().toString();
            datos = getString(R.string.radio) + " " + radio_t + "--" + getString(R.string.lbl_altura) + " " + altura_t ;
            String temp;
            temp = String.format("%.2f", ( PI * Math.pow( parseDouble(radio_t) , 2) * parseDouble(altura_t) ) / 3 );
            resultado =  parseDouble(temp);
            op = new Operacion(nombre_operacion, datos, resultado );
            op.guardar();
            Toast.makeText(this, getString(R.string.mensaje_volumen) + " " +resultado,Toast.LENGTH_LONG).show();
        }
    }
    public void limpiar(View v){
        radio.setText("");
        altura.setText("");
        radio.requestFocus();
    }
    public Boolean Validar(){
        radio = findViewById(R.id.txtAlturaCono);
        altura = findViewById(R.id.txtRadioCono);
        if(radio.getText().toString().isEmpty()){
            radio.setError(getString(R.string.error));
            radio.requestFocus();
            return  false;
        }
        if(altura.getText().toString().isEmpty()){
            altura.setError(getString(R.string.error));
            altura.requestFocus();
            return  false;
        }
        return true;
    }
}