package com.jesus.ClasesAbstracta;

class Lobo extends Canino{

    private  int numeroCamaradas;
    private  String especieLobo  = "Lobo" ;

    public Lobo(String habita, double altura, double largo, double peso, String nombreCientifico, String color,
                double tamanioColmillo, int numeroCamaradas, String especieLobo) {
        super(habita, altura, largo, peso, nombreCientifico, color, tamanioColmillo);
        this.numeroCamaradas = numeroCamaradas;
        this.especieLobo = especieLobo;
    }

    public int getNumeroCamaradas() {
        return numeroCamaradas;
    }

    public void setNumeroCamaradas(int numeroCamaradas) {
        this.numeroCamaradas = numeroCamaradas;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza junto a su grupo de " + numeroCamaradas
                + " individuos en los bosques de " + habita;
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en las cabernas de " + habita;
    }

    @Override
    public String corre() {
        return "El Lobo " + especieLobo + " corre en las llanuras aledañas a los bosques de " + habita ;
    }

    @Override
    public String comunicarse() {
        return "El Lobo " + especieLobo + " " + color + " aulla en luna llena";
    }

}
