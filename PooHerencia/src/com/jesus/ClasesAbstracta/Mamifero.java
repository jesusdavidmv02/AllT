package com.jesus.ClasesAbstracta;

abstract  public class Mamifero {

    protected   String habita;
    protected   double altura;
    protected   double largo ;
    protected   double peso ;
    protected   String nombreCientifico;

    public Mamifero(String habita, double altura, double largo, double peso, String nombreCientifico) {
        this.habita = habita;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabita() {
        return habita;
    }

    public void setHabita(String habita) {
        this.habita = habita;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public  abstract  String comer();
    public  abstract  String dormir();
    public  abstract  String corre();
    public  abstract  String comunicarse();

}
