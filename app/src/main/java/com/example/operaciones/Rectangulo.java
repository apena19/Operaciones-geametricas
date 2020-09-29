package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Math.PI;

public class Rectangulo extends AppCompatActivity {
    private EditText base,altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        base = findViewById(R.id.txtBaseRect);
        altura = findViewById(R.id.txtAlturaRect);
    }
    public void CalcularT(View v){
        if(Validar()){
            Double resultado;
            String datos, nombre_operacion, baseT, alturaT ;
            Operacion op;
            nombre_operacion = getString(R.string.lbl_areaRectangulo);
            baseT = base.getText().toString();
            alturaT = altura.getText().toString();
            datos = getString(R.string.lblbase) + " " + baseT + "--" + getString(R.string.lbl_altura) + " " + alturaT ;
            String temp;
            temp = String.format("%.2f", parseDouble(baseT ) * parseDouble(alturaT) );
            resultado =  parseDouble(temp);
            op = new Operacion(nombre_operacion, datos, resultado );
            op.guardar();
            Toast.makeText(this, getString(R.string.mensaje_area) + " " +resultado,Toast.LENGTH_LONG).show();
        }
    }
    public void limpiar(View v){
        base.setText("");
        altura.setText("");
        base.requestFocus();
    }
    public Boolean Validar(){
        base = findViewById(R.id.txtBaseRect);
        altura = findViewById(R.id.txtAlturaRect);
        if(base.getText().toString().isEmpty()){
            base.setError(getString(R.string.error));
            base.requestFocus();
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