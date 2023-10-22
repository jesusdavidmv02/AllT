import java.util.Arrays;

/**
 *
 El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.
 Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.
 Por ejemplo, para el arreglo:
 String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
 debería quedar:
 {"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
 Preguntas de esta tarea
 Publica acá tu código fuente de la tarea
 */

public class ArrregloBidimencional {
    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Arrays.stream(lenguajes).flatMap(arr -> Arrays.stream(arr)).distinct().forEach(e -> System.out.println(e));

    }
}
