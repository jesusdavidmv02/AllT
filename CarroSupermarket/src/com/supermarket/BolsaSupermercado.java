package com.supermarket;

import java.util.ArrayList;
import java.util.List;

public  class BolsaSupermercado<T> {

    private List<T> productos;
    private int indiceProductos;
    private int max = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList();
    }

    public List<T> getProductos() {
        return productos;
    }

    public void addProducto(T element) {
       productos.add(element);
    }

}
