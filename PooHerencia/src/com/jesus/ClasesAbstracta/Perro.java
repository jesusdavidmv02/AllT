package com.jesus.ClasesAbstracta;

public class Perro  extends  Canino {

    private  int fuerzaModida ;

    public Perro(String habita, double altura, double largo, double peso, String nombreCientifico, String color,
                 double tamanioColmillo, int fuerzaModida) {
        super(habita, altura, largo, peso, nombreCientifico, color, tamanioColmillo);
        this.fuerzaModida = fuerzaModida;
    }

    public int getFuerzaModida() {
        return fuerzaModida;
    }

    public void setFuerzaModida(int fuerzaModida) {
        this.fuerzaModida = fuerzaModida;
    }

    @Override
    public String comer() {
        return "El perro africano caza en manada con una fuerte mordida de " + fuerzaModida + " PSI, posee fuertes mandíbulas y grandes orejas redondeadas";
    }

    @Override
    public String dormir() {
        return "El perro africano duerme en la sabana africana";
    }

    @Override
    public String corre() {
        return "El perro africano corre en las llanuras aledañas a la sabana!";
    }

    @Override
    public String comunicarse() {
        return "Los perros ladran de noche durante cacerías nocturnas";
    }



}
