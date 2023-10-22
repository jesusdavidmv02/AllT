package Productos;

public class Productos {
    private double precio;
    private double cantidad;

    public Productos(double precio, double cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getCantidad() {
        return cantidad;
    }
}
