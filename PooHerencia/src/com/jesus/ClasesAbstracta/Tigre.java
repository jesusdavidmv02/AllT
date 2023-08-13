package com.jesus.ClasesAbstracta;

public class Tigre  extends Felino{

    private String especie = "tigre";

    public Tigre(String habita, double altura, double largo, double peso, String nombreCientifico,
                 double tamanioGarra, int velocidad, String especie) {
        super(habita, altura, largo, peso, nombreCientifico, tamanioGarra, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    @Override
    public String comer() {
        return "El Tigre " +  especie + " caza solitario en los manglares y bosques monzónicos de " + habita;
    }

    @Override
    public String dormir() {
        return "El Tigre " + especie + " duerme en la selvas de " + habita;
    }

    @Override
    public String corre() {
        return "El Tigre " + especie + " corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Ruge Tigre y agacha sus orejas";
    }
}

