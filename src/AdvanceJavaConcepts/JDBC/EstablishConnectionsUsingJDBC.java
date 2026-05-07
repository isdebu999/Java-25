package AdvanceJavaConcepts.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnectionsUsingJDBC {

    public static void main(String[] args) {
        try {

            //Step:1
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded...");

            //Step:2
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_learning",
                     "root",
                     "debu9733"
            );
            System.out.println("Connection Established...");
        }catch (Exception exception) {
            throw  new RuntimeException(exception);
        }
    }
}
