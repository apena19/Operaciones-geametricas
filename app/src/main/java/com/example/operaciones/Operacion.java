package com.example.operaciones;

public class Operacion {
    private String nombre_operacion;
    private String Datos;
    private Double Resultado;

    public Operacion(String nombre_operacion, String datos, Double resultado) {
        this.nombre_operacion = nombre_operacion;
        Datos = datos;
        Resultado = resultado;
    }

    public String getNombre_operacion() {
        return nombre_operacion;
    }

    public void setNombre_operacion(String nombre_operacion) {
        this.nombre_operacion = nombre_operacion;
    }

    public String getDatos() {
        return Datos;
    }

    public void setDatos(String datos) {
        Datos = datos;
    }

    public Double getResultado() {
        return Resultado;
    }

    public void setResultado(Double resultado) {
        Resultado = resultado;
    }
    public void guardar(){
        Data.guardar(this);
    }
}
