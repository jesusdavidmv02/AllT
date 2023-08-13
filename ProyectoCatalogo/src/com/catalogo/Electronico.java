package com.catalogo;

abstract public class Electronico extends Producto implements  IElectronico{

    private  String fabrincantes ;

    public Electronico(int precio, String fabrincantes) {
        super(precio);
        this.fabrincantes = fabrincantes;
    }

    @Override
    public String getFabricante() {
        return null;
    }
}
