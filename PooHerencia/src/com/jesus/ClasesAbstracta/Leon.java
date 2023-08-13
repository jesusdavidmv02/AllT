package com.jesus.ClasesAbstracta;

public class Leon extends Felino{

    private  int manada;
    private  double potenciaGurgido;

    public Leon(String habita, double altura, double largo, double peso, String nombreCientifico,
                double tamanioGarra, int velocidad, int manada, double potenciaGurgido) {
        super(habita, altura, largo, peso, nombreCientifico, tamanioGarra, velocidad);
        this.manada = manada;
        this.potenciaGurgido = potenciaGurgido;
    }


    public int getManada() {
        return manada;
    }

    public void setManada(int manada) {
        this.manada = manada;
    }

    public double getPotenciaGurgido() {
        return potenciaGurgido;
    }

    public void setPotenciaGurgido(double potenciaGurgido) {
        this.potenciaGurgido = potenciaGurgido;
    }


    @Override
    public String comer() {
        return "El Leon caza junto a su grupo de " + manada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El Leon duerme en las estepas africanas";
    }

    @Override
    public String corre() {
        return "El Leon corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Leon ruge fuerte a " + potenciaGurgido + " decibeles";
    }
}
