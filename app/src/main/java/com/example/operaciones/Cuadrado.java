package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Math.PI;

public class Cuadrado extends AppCompatActivity {
    private EditText lados_cuadrado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        lados_cuadrado = findViewById(R.id.txtLadosCuadrado);
    }

    public void Calcular(View v){
        if(Validar() ){
            Double resultado;
            String datos, nombre_operacion, lado;
            Operacion op;
            nombre_operacion = getString(R.string.lbl_operacion_cuadrado);
            lado = lados_cuadrado.getText().toString();
            datos = getString(R.string.lbl_lados) + " " + lado;
            String temp;
            temp = String.format("%.2f", parseDouble(lado) * parseDouble(lado));
            resultado = parseDouble(temp);
            op = new Operacion(nombre_operacion, datos, resultado);
            op.guardar();
            Toast.makeText(this, getString(R.string.mensaje_area) + " " + resultado, Toast.LENGTH_LONG).show();
        }
    }
    public void limpiar(View v){
        lados_cuadrado.setText("");
        lados_cuadrado.requestFocus();
    }
    public Boolean Validar(){
        lados_cuadrado = findViewById(R.id.txtLadosCuadrado);
        if(lados_cuadrado.getText().toString().isEmpty()){
            lados_cuadrado.setError(getString(R.string.error));
            lados_cuadrado.requestFocus();
            return  false;
        }
        return true;
    }
}