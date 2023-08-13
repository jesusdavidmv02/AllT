package com.jesus.almaceyverduleria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Producto[] productos = new Producto[8];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < productos.length; i++) {

            if (i < 2) {
                System.out.println("Digite el los campos de Fruta (nombre , precio , peso , color ");

                System.out.print("Digite el  nombre : ");
                String nombre = sc.nextLine();

                System.out.print("Digite precio  : ");
                double precio = sc.nextDouble() ;

                System.out.print("Digite su peso : ");
                double peso  = sc.nextDouble();

                System.out.print("digite su color de la fruta  ");
                String color = sc.nextLine();

                productos[i] = new Fruta(nombre, precio, peso, color );
                sc.nextLine();
                System.out.println("############ su registro guandado correctamente ############");
            }
            else if (i >= 2 && i <=3 ) {

                System.out.println("Digite el los campos de Limpieza (nombre , precio , Componetes  , litros ");

                System.out.print("Digite el  nombre : ");
                String nombre = sc.nextLine();

                System.out.print("Digite precio : ");
                double precio = sc.nextDouble() ;

                System.out.print("Digite su Componentes  : ");
                String componentes  = sc.nextLine(); sc.nextLine();

                System.out.print("digite su cantida en litros :  ");
                double litros = sc.nextDouble();

                productos[i] = new Limpieza(nombre, precio , componentes , litros) ;
                sc.nextLine();

                System.out.println("############ su registro guandado correctamente ############");
            }

            else if (i >= 4 && i <=5 ) {

                System.out.println("Digite el los campos de Lacteo (nombre , precio , Cantidad  , proteina ");

                System.out.print("Digite el  nombre : ");
                String nombre = sc.nextLine();

                System.out.print("Digite precio : ");
                double precio = sc.nextDouble() ;

                System.out.print("Digite su Cantidad : ");
                int cantidad  = sc.nextInt();

                System.out.print("digite su cantida en litros :  ");
                int proteina = sc.nextInt();

                productos[i] = new Lacteo(nombre, precio, cantidad, proteina)  ;

                sc.nextLine();
                System.out.println("############ su registro guandado correctamente ############");

            }else {
                System.out.println("Digite el los campos de NoPerecible (nombre , precio , Contenido  , Calorias ");

                System.out.print("Digite el  nombre : ");
                String nombre = sc.nextLine();

                System.out.print("Digite precio  : ");
                double precio = sc.nextDouble() ;

                System.out.print("Digite su Contenido  : ");
                int contenido  = sc.nextInt();

                System.out.print("digite su cantida en caloriaz :  ");
                int caloria = sc.nextInt();

                productos[i] = new NoPerecible(nombre, precio, contenido, caloria  );
                sc.nextLine();
                System.out.println("############ su registro guandado correctamente ############");
            }
        }

        for (Producto prod : productos) {
            System.out.println("------------------ " + prod.getClass().getSimpleName() + "-------------");
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());

            if (prod instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                System.out.println("Color: " + ((Fruta) prod).getColor() );
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponetes());
                System.out.println("Litros: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteina());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
            }
        }
    }
}
