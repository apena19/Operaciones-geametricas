package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarOperaciones extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Operacion> registros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_operaciones);
        tabla = findViewById(R.id.tblRegistros);
        registros = Data.obtener();

        for (int i = 0; i < registros.size() ; i++) {
            TableRow fila = new TableRow(this);

            TextView columna_uno = new TextView(this);
            TextView columna_dos = new TextView(this);
            TextView columna_tres = new TextView(this);
            TextView columna_cuatro = new TextView(this);

            columna_uno.setText(""+(i+1));
            columna_dos.setText(registros.get(i).getNombre_operacion());
            columna_tres.setText(registros.get(i).getDatos());
            columna_cuatro.setText(""+ registros.get(i).getResultado());

            fila.addView(columna_uno);
            fila.addView(columna_dos);
            fila.addView(columna_tres);
            fila.addView(columna_cuatro);

            tabla.addView(fila);

        }
    }
}