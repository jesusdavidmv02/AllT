package com.jesus.ClasesAbstracta;

abstract  class Canino extends Mamifero {

    protected String color ;
    protected double tamanioColmillo;

    public Canino(String habita, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillo) {
        super(habita, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillo = tamanioColmillo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamanioColmillo() {
        return tamanioColmillo;
    }

    public void setTamanioColmillo(double tamanioColmillo) {
        this.tamanioColmillo = tamanioColmillo;
    }


}
