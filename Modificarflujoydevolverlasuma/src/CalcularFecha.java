import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una
 * fecha del tipo LocalDate y calcular la edad de la persona de acuerdo a la fecha actual.
 * Preguntas de esta tarea
 * Cuál es el código de tu solución, publicala acá mismo
 */

public class CalcularFecha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = sc.nextLine();

        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual = LocalDate.now();

        Period  periodo = Period.between(fechaNacimiento, actual);
        System.out.printf("Tu edad es: %s años, %s meses y %s días", periodo.getYears(), periodo.getMonths(), periodo.getDays());

    }
}
