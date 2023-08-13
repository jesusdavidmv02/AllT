package com.supermarket;

public class Limpieza extends Producto {

    private  String componentes ;
    private  double litro;

    public Limpieza(String nombre, double precio, String componentes, double litro) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litro = litro;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }


}
