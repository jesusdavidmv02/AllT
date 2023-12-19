package org.Jmendoza.main;
import org.Jmendoza.Util.ConexionBatabase;
import org.Jmendoza.modelo.Usuario;
import org.Jmendoza.repositorio.Repositorio;
import org.Jmendoza.repositorio.RepositorioImplement;


import java.sql.Connection;
import java.sql.SQLException;

public class MainUpdate {
    public static void main(String[] args) {
        try (Connection conn = ConexionBatabase.getInstane()) {

            Repositorio<Usuario> repositorio = new RepositorioImplement();
            System.out.println("============= listar =============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("============= obtener por id =============");
            System.out.println(repositorio.porid(1L));

            System.out.println("============= editar producto =============");
            Usuario user = new Usuario();
            user.setId(1L);
            user.setName("Teclado Razer mecánico");
            user.setLasname("mendoza");
            user.setEdad(90);
            repositorio.inser(user);

            System.out.println("Producto editado con éxito");
            repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
