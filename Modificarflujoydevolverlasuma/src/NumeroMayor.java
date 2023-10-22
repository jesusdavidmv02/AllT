import java.util.Arrays;
import java.util.Scanner;
/***
 El siguiente ejercicio es obtener el numero mayor de un arreglo pero utilizando programación funcional,
 implementando la expresión lambda Function<T,R> (que viene predefinida) con el api stream y operador reduce.
 Preguntas de esta tarea
 Publica acá tu código fuente de la tarea
 *
 */

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("tamaño de areglo : " );
        int tam = sc.nextInt();
        
        int [] arreglo = new int[tam];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("dijite datos y para el arreglos : ");
            arreglo[i]= sc.nextInt();
        }

        Arrays.stream(arreglo).max();

        System.out.println( "El dato mayor de un array  es de : " + Arrays.stream(arreglo).max());
        
        
        
    }


}
