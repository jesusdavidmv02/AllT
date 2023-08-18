
import com.tareasUdemy.modulo.Vuelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<Vuelo> vuelo =  new ArrayList<>();

        vuelo.add(new Vuelo("AAL 933", "New York", "Santiago", new Date("2021/08/29"), 62));
        vuelo.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", new Date("2021/08/31 04:45"), 47));
        vuelo.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", new Date("2021/08/30 16:00"), 52));
        vuelo.add(new Vuelo("DAL 147", "Atlanta", "Santiago", new Date("2021/08/29 13:22"), 59));
        vuelo.add(new Vuelo("AVA 241", "Bogota", "Santiago", new Date("2021/08/31 14:05"), 25));
        vuelo.add(new Vuelo("AMX 10", "Mexico City", "Santiago", new Date("2021/08/31 05:20"), 29));
        vuelo.add(new Vuelo("IBE 6833", "Londres", "Santiago", new Date("2021/08/30 08:45"), 55));
        vuelo.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", new Date("2021/08/29 07:41"), 51));
        vuelo.add(new Vuelo("SKU 803", "Lima", "Santiago", new Date("2021/08/30 10:35"), 48));
        vuelo.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", new Date("2021/08/29 09:14"), 59));
        vuelo.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", new Date("2021/08/31 08:33"), 31));
        vuelo.add(new Vuelo("CMP 111", "Panama City", "Santiago", new Date("2021/08/31 15:15"), 29));
        vuelo.add(new Vuelo("LAT 705", "Madrid", "Santiago", new Date("2021/08/30 08:14"), 47));
        vuelo.add(new Vuelo("AAL 957", "Miami", "Santiago", new Date("2021/08/29 22:53"), 60));
        vuelo.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", new Date("2021/08/31 09:57"), 32));
        vuelo.add(new Vuelo("LAT 1283", "Cancún", "Santiago", new Date("2021/08/31 04:00"), 35));
        vuelo.add(new Vuelo("LAT 579", "Barcelona", "Santiago", new Date("2021/08/29 07:45"), 61));
        vuelo.add(new Vuelo("AAL 945", "Dallas/Fort Worth", "Santiago", new Date("2021/08/30 07:12"), 58));
        vuelo.add(new Vuelo("LAT 501", "París", "Santiago", new Date("2021/08/29 18:29"), 49));
        vuelo.add(new Vuelo("LAT 405", "Montevideo", "Santiago", new Date("2021/08/30 15:45"), 39));


        vuelo.sort((v1, v2) -> v2.getFechayHoraLlegada().compareTo(v1.getFechayHoraLlegada()));

        vuelo.forEach(System.out::println);


        Vuelo ultimoVuelo = vuelo.get(0);


        System.out.println("___________________________________________________");
        System.out.println("El último vuelo en llegar es " + ultimoVuelo.getNombre() + ": " + ultimoVuelo.getOrigen() + ", aterriza el " + ultimoVuelo.getFechayHoraLlegada());

        vuelo.sort((v1, v2) -> Integer.valueOf(v2.getNumeroPasajeros()).compareTo(v1.getNumeroPasajeros()));

        Vuelo vueloNenorNumero = new LinkedList<>(vuelo).peekLast();

        System.out.println("El vuelo con menor número de pasajeros es "
                + vueloNenorNumero.getNombre() + ": " + vueloNenorNumero.getOrigen()+ ", con "
                + vueloNenorNumero.getNumeroPasajeros() + " pasajeros.");
    }
}