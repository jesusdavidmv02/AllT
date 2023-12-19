package org.Jmendoza;

import org.Jmendoza.Util.ConexionBatabase;

import java.sql.*;

public class EjemploJdbcAuto {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/EjemploJdbc?servertimezone=GMT-5";
        String username = "root";
        String password = "";

        try (Connection conn = ConexionBatabase.getInstane();
             Statement stmt = conn.createStatement();
             ResultSet result = stmt.executeQuery("SELECT * FROM Usuario")){
            
            while (result.next()) {
                System.out.print(result.getInt("id") + " | "
                        + result.getString("name") + " | "
                        + result.getString("lastname") + " | "
                        + result.getInt("edad") + " ");
            }
            result.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}

