package org.Jmendoza.main;

import org.Jmendoza.Util.ConexionBatabase;
import org.Jmendoza.modelo.Usuario;
import org.Jmendoza.repositorio.Repositorio;
import org.Jmendoza.repositorio.RepositorioImplement;

import java.sql.Connection;
import java.sql.SQLException;

public class MainDelete {
    public static void main(String[] args) {
        try (Connection conn = ConexionBatabase.getInstane()) {

            Repositorio<Usuario> repositorio = new RepositorioImplement();
            System.out.println("============= listar =============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("============= obtener por id =============");
            System.out.println(repositorio.porid(1L));

            System.out.println("============= Eliminar producto =============");
            repositorio.delete(3L);
            System.out.println("Producto eliminado con éxito");
            repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
