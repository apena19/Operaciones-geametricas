package com.example.operaciones;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Operacion> operacion = new ArrayList();

    public static void guardar(Operacion op){
        operacion.add(op);
    }

    public static ArrayList<Operacion> obtener(){
        return operacion;
    }
}
