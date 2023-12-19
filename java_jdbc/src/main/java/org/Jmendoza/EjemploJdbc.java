package org.Jmendoza;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/EjemploJdbc?servertimezone=GMT-5";
        String username = "root";
        String password = "";

        ResultSet repuesta = null;
        Statement stmt = null;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            repuesta = stmt.executeQuery("SELECT * FROM Usuario");

            while (repuesta.next()) {
                System.out.println(repuesta.getString("id") + " "
                        + repuesta.getString("name") + " "
                        + repuesta.getString("lastname") + " "
                        + repuesta.getString("edad") + " ");


                System.out.println("     ");

            }
            repuesta.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                repuesta.close();
                stmt.close();
                conn.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
