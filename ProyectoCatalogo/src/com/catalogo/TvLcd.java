package com.catalogo;


public class TvLcd extends Electronico {

    private double pulgada;

    public TvLcd(int precio, String fabrincantes, double pulgada) {
        super(precio, fabrincantes);
        this.pulgada = pulgada;
    }

    public double getPulgada() {
        return pulgada;
    }

    public void setPulgada(double pulgada) {
        this.pulgada = pulgada;
    }


    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.5;
    }

    @Override
    public String getFabricante() {
        return null;
    }
}

