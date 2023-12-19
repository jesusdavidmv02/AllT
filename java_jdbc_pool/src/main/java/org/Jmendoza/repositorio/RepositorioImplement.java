package org.Jmendoza.repositorio;
import org.Jmendoza.Util.ConexionBatabase;
import org.Jmendoza.modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioImplement implements Repositorio<Usuario>{

    private Connection getConnection() throws SQLException {
        return ConexionBatabase.getInstane();
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> result = new ArrayList<>();
        try(Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Usuario")){
            while (rs.next()){
                Usuario user = CrearUsuario(rs);
                result.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public Usuario porid(Long id) {
        Usuario user =  null;
        try (PreparedStatement stmt = getConnection().prepareStatement("Select * from  Usuario where id = ?")){
            stmt.setLong(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                user  =  CrearUsuario(rs);
            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public void inser(Usuario usuario) {

        String sql;
        if (usuario.getId() != 0 && usuario.getId()>0) {
            sql = "UPDATE usuarios SET name=?, lastname=? ,edad=? WHERE id=?";
        } else {
            sql = "INSERT INTO usuarios(name, lastname, edad) VALUES(?,?,?)";
        }
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, usuario.getName());
            stmt.setString(2, usuario.getLasname());
            stmt.setInt(3, (int) usuario.getEdad());

            if (usuario.getId() != 0 && usuario.getId() > 0) {
                stmt.setLong(3, usuario.getId());
            } else {

            }
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Long id) {

        try (PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM usuario WHERE id=?")) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private static Usuario CrearUsuario(ResultSet rs) throws SQLException {
        Usuario user = new Usuario();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setLasname(rs.getString("lastname"));
        user.setEdad(rs.getInt("edad"));
        return user;
    }


}
