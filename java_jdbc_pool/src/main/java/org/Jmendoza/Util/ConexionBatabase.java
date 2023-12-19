package org.Jmendoza.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBatabase {

    private static  String url = "jdbc:mysql://localhost:3306/EjemploJdbc?servertimezone=GMT-5";
    private static  String username = "root";
    private static String password = "";
    private static Connection conn;


    public static Connection getInstane() throws SQLException {
        if (conn ==  null){
            conn = DriverManager.getConnection(url,username,password);
        }
        return conn;
    }
}
