package AdvanceJavaConcepts.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PerformOperationInJDBC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String sqlQuery = "INSERT INTO Student VALUES (?,?,?)";
        String driverPath = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/jdbc_learning";
        String userName = "root";
        String password = "debu9733";

        try {
            Class.forName(driverPath);
            connection = DriverManager.getConnection(url, userName, password);
            preparedStatement = connection.prepareStatement(sqlQuery);

            System.out.println("Enter Student ID:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Student Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Student Marks:");
            int marks = scanner.nextInt();

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, marks);

            int noOfRowAffected = preparedStatement.executeUpdate();
            System.out.println(noOfRowAffected + " row(s) inserted.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
                scanner.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}