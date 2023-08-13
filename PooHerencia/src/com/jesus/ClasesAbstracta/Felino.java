package com.jesus.ClasesAbstracta;

 abstract  class Felino extends Mamifero {

     protected double tamanioGarra;
     protected int velocidad;

     public Felino(String habita, double altura, double largo, double peso, String nombreCientifico, double tamanioGarra, int velocidad) {
         super(habita, altura, largo, peso, nombreCientifico);
         this.tamanioGarra = tamanioGarra;
         this.velocidad = velocidad;
     }




    public double getTamanioGarra() {
        return tamanioGarra;
    }

    public void setTamanioGarra(double tamanioGarra) {
        this.tamanioGarra = tamanioGarra;
    }

    public int getVelocidad() { return velocidad;}

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


}
