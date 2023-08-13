import com.supermarket.*;

public class Main {

    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();

        
        BolsaSupermercado<Limpieza> bolsaLimpiezas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaFrutas.addProducto(new Fruta("roja", 12000, 2500d, "manzana fuji" ));
        bolsaFrutas.addProducto(new Fruta("Manzana",10000,500, "rojo"));
        bolsaFrutas.addProducto(new Fruta("Pera",10000,500, "verde"));
        bolsaFrutas.addProducto(new Fruta("Fresa",10000,500, "Rojas"));
        bolsaFrutas.addProducto(new Fruta("Moras",10000,500, "violetas"));
        bolsaFrutas.addProducto(new Fruta("Moras",10000,500, "violetas"));
        bolsaFrutas.addProducto(new Fruta("Moras",10000,500, "violetas"));

        bolsaLimpiezas.addProducto(new Limpieza("cloro",5000,"ipoclorito", 10));
        bolsaLimpiezas.addProducto(new Limpieza("fat",5000,"limpi", 10));
        bolsaLimpiezas.addProducto(new Limpieza("fabulozo",5000,"detengente", 10));
        bolsaLimpiezas.addProducto(new Limpieza("jabon de baño",5000,"ipoclorito", 10));
        bolsaLimpiezas.addProducto(new Limpieza("varsol",5000,"ipoclorito", 10));

        bolsaLacteos.addProducto(new Lacteo("leche",1000,1651,211));
        bolsaLacteos.addProducto(new Lacteo("Yogur",1000,1651,211));
        bolsaLacteos.addProducto(new Lacteo("Mantaquilla",1000,1651,211));
        bolsaLacteos.addProducto(new Lacteo("Bongurd",1000,1651,211));
        bolsaLacteos.addProducto(new Lacteo("alpinito",1000,1651,211));

        bolsaNoPerecibles.addProducto(new NoPerecible("Azucar" ,1111,156,115));
        bolsaNoPerecibles.addProducto(new NoPerecible("Sal" ,1111,156,115));
        bolsaNoPerecibles.addProducto(new NoPerecible("galletas" ,1111,156,115));
        bolsaNoPerecibles.addProducto(new NoPerecible("cereales" ,1111,156,115));
        bolsaNoPerecibles.addProducto(new NoPerecible("Azucar" ,1111,156,115));


        System.out.println("-------------------------------- Frutas ---------------------------------");

        for (Fruta fruta : bolsaFrutas.getProductos()) {
            System.out.println("---------- " +  fruta.getNombre()+"--------");
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso (gr): " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        }

        // System.exit(0);

        System.out.println("-------------------------------- Limpieza ---------------------------------");
        for (Limpieza prod : bolsaLimpiezas.getProductos()) {
            System.out.println("----------" +  prod.getNombre()+"-----------");
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitro());
        }

        System.out.println("-------------------------------- Lacteo ---------------------------------");
        for (Lacteo prod : bolsaLacteos.getProductos()) {
            System.out.println("-----------" +  prod.getNombre()+"-------------");
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Cantidad (gr/cc): " + prod.getCantidad());
            System.out.println("Proteinas (gr): " + prod.getProteinas());
        }

        System.out.println("-------------------------------- NoPerecible ---------------------------------");
        for (NoPerecible prod : bolsaNoPerecibles.getProductos()) {
            System.out.println("-------------" +  prod.getNombre() + "----------------");
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Calorias (kCal): " + prod.getCalorias());
            System.out.println("Contenido neto (gr): " + prod.getContenido());
        }

    }


}