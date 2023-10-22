package Productos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inicio {

    public static void main(String[] args) {

        List<Productos> facturas = Arrays.asList(new Productos(9.99,1),
                new Productos(80 , 2) , new Productos(800,9));

          // double  sum = facturas.stream().map(p ->p.getCantidad() * p.getPrecio()).reduce(0d,Double::sum);

            double sum  = facturas.stream().mapToDouble(x -> x.getCantidad() * x.getPrecio()).sum();

            System.out.println(sum);

    }
}
