package com.jesus.herencia;

public class Empleado extends  Persona {

     public   double remuneracion ;
     public   int empleadorold;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadorold =empleadorold;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadorold() {
        return empleadorold;
    }

    public void setEmpleadorold(int empleadorold) {
        this.empleadorold = empleadorold;
    }

    public void AumentoRemuneracion (int porcentaje){
        this.remuneracion += remuneracion * porcentaje/100;
    }

    @Override
    public String toString() {
        return "Empleado{" + "remuneracion=" + remuneracion + ", empleadorold=" + empleadorold +'}';
    }
}
