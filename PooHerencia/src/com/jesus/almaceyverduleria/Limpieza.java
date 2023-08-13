package com.jesus.almaceyverduleria;

public class Limpieza extends  Producto {

    private  String componetes ;
    private  double litros;


    public Limpieza(String nombre, double precio, String componetes,  double litros) {
        super(nombre, precio);
         this.componetes = componetes ;
         this.litros = litros;
    }

    public String getComponetes() {
        return componetes;
    }

    public void setComponetes(String componetes) {
        this.componetes = componetes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}
