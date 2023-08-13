package com.jesus.herencia;

public class Gerente extends Empleado {

    private  int presupuesto ;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion,int presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

}
