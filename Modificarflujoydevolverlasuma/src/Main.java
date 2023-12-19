import java.util.Arrays;

/**Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int, utilizando
 * el api stream se pide eliminar los divisibles en 10, luego convertir los elementos restante
 * del flujo en tipo double y dividirlos en 2, para finalmente devolver la suma total de todos
 * ellos usando el operador terminal reduce El resultado debería ser 2250.0
 * */

public class Main {
    public static void main(String[] args) {

        int[] arry = new int[100];

        for (int i = 0; i < arry.length; i++) {
            arry[i] = i + 1;
        }
        double total = Arrays.stream(arry).sum();

        double eliminarElementos = Arrays.stream(arry).filter(e -> e % 10 != 0)
                .mapToDouble(e -> (double) e / 2)
                .reduce(0, (ac, e) -> ac + e);

        System.out.println("_______________");

        System.out.println(eliminarElementos);


        }

}