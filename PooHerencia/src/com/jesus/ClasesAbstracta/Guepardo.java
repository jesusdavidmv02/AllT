package com.jesus.ClasesAbstracta;

public class Guepardo extends  Felino {

    public Guepardo(String habita, double altura, double largo, double peso, String nombreCientifico,
                    double tamanioGarra, int velocidad) {
        super(habita, altura, largo, peso, nombreCientifico, tamanioGarra, velocidad);
    }


    @Override
    public String comer() {
        return "El Guepardo caza junto a su grupo en las llanuras africanas, con un mordida mucho inferior a los demas felinos grandes.";
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme en las estepas africanas";
    }

    @Override
    public String corre() {
        return "El Guepardo es el felino mas rapido del mundo, corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo ruge no tan fuerte como el Leon";
    }

}
