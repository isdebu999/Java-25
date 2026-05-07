package AdvanceJavaConcepts.JDBC.OperationInJDBC.dbUtility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_learning";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "debu9733";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }
}
