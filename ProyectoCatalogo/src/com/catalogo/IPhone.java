package com.catalogo;

public class IPhone extends Electronico {

    private  String  color ;
    private  String modelo ;

    public IPhone(int precio, String fabrincantes, String color, String modelo) {
        super(precio, fabrincantes);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }
}
