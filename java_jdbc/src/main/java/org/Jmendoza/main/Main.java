package org.Jmendoza.main;

import org.Jmendoza.Util.ConexionBatabase;
import org.Jmendoza.modelo.Usuario;
import org.Jmendoza.repositorio.Repositorio;
import org.Jmendoza.repositorio.RepositorioImplement;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try(Connection conn = ConexionBatabase.getInstane()){
            Repositorio<Usuario> rest = new RepositorioImplement();

            rest.listar().forEach(p-> System.out.println(p.getId() + " | " + p.getName() + " | " + p.getLasname() + " | " + p.getEdad() ));

            rest.listar().forEach(System.out::println);

            System.out.println(rest.porid(2L));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
