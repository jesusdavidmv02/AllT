package com.jesus.ClasesAbstracta;

import com.jesus.ClasesAbstracta.*;

public class Main {

    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        Mamifero leon = new Leon("Selba Africana" , 2,2 ,200, "Panthera leo",2,100,9,5);
        Mamifero tigre = new Tigre("selba Aficana",2,2,3,"Panthera tigris",2,5," ");
        Mamifero lobo = new Lobo("bosques de las montañas",2,5,6,"Canis lupus","gris",5,9,"");
        Mamifero perro = new Perro("son  animales domestico osea la casa de sus dueños ", 2,3,50,"Canis lupus familiaris","negro",2,6);
        Mamifero tigreBengala = new Tigre("selba Africana" , 2,5,8,"Panthera tigris",9,8,"");
        Mamifero guepardo = new Guepardo("Selba Africana" ,4,8,9,"Acinonyx jubatus",2,9);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigreBengala;
        mamiferos[5] = guepardo;

        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabita());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) animal).getTamanioColmillo());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumeroCamaradas());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaModida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanioGarra());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaGurgido());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecie());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.corre());
            System.out.println(animal.comunicarse());
        }
    }
}
