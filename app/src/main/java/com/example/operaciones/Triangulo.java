package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class Triangulo extends AppCompatActivity {
    private EditText base,altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        base = findViewById(R.id.txtBaseTri);
        altura = findViewById(R.id.txtAlturaTri);
    }
    public void Calcular(View v){
        Double resultado;
        String datos, nombre_operacion, baseT, alturaT ;
        Operacion op;
        nombre_operacion = getString(R.string.lbl_areatriangulo);
        baseT = base.getText().toString();
        alturaT = altura.getText().toString();
        datos = getString(R.string.lblbase) + " " + baseT + "--" + getString(R.string.lbl_altura) + " " + alturaT ;
        resultado =  ( parseDouble(baseT ) * parseDouble(alturaT) ) / 2;
        op = new Operacion(nombre_operacion, datos, resultado );
        op.guardar();
        Toast.makeText(this, getString(R.string.mensaje_area) + " " +resultado,Toast.LENGTH_LONG).show();
    }
    public void limpiar(View v){
        base.setText("");
        altura.setText("");
        base.requestFocus();
    }
}