package com.jesus.herencia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Jesus david",
                "Mendoza Vergara",
                "104750",
                "Cr 101a #37-48 san jose ",
                1000000 );

        gerente.AumentoRemuneracion(15);
        gerente.setPresupuesto((int) 77000000.00);
        System.out.println(gerente);

        System.out.println("======================================");


        Scanner sc = new Scanner(System.in);

        System.out.println("hacemo la prueba digitando datos de pruebas :");

        System.out.print(" digite el nombre  : ");
        String nombre = sc.nextLine() ;

        System.out.print(" digite el apellido  : ");
        String apellido = sc.nextLine() ;

        System.out.print(" digite el El numero fiscal   : ");
        String fiscal = sc.nextLine() ;

        System.out.print(" digite el digite la direccion  : ");
        String direccion = sc.nextLine() ;

        System.out.print(" digite el presupuesto anual :  ");
        int presupuesto = sc.nextInt() ;


        Gerente gerente02 = new Gerente(nombre, apellido ,fiscal , direccion, presupuesto);


        System.out.println("gerente02 = " + gerente02);






    }
}
