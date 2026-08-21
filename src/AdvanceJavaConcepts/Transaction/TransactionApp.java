package AdvanceJavaConcepts.Transaction;

import AdvanceJavaConcepts.JDBC.OperationInJDBC.dbUtility.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        Connection connection = null;

        final String SQL_QUERY_1 =
                "UPDATE BANK SET balance = balance - ? " +
                        "WHERE account_no = ? AND password = ?";

        final String SQL_QUERY_2 =
                "UPDATE BANK SET balance = balance + ? " +
                        "WHERE account_no = ?";

        try {
            connection = DBConnection.getConnection();

            connection.setAutoCommit(false);

            preparedStatement1 = connection.prepareStatement(SQL_QUERY_1);
            preparedStatement2 = connection.prepareStatement(SQL_QUERY_2);

            System.out.println("Enter From A/c and Password: ");
            int fromAccountNumber = sc.nextInt();
            String password = sc.next();

            System.out.println("Enter To A/c: ");
            int toAccountNumber = sc.nextInt();

            System.out.println("Enter Amount to be transferred: ");
            int amount = sc.nextInt();

            preparedStatement1.setInt(1, amount);
            preparedStatement1.setInt(2, fromAccountNumber);
            preparedStatement1.setString(3, password);

            int rowCount1 = preparedStatement1.executeUpdate();

            preparedStatement2.setInt(1, amount);
            preparedStatement2.setInt(2, toAccountNumber);

            int rowCount2 = preparedStatement2.executeUpdate();

            if (rowCount1 > 0 && rowCount2 > 0) {
                connection.commit();
                System.out.println("Transaction Successful!");
            } else {
                connection.rollback();
                System.out.println("Transaction Failed!!");
            }

        }catch (Exception e) {
            try{
                if(connection != null){
                    connection.rollback();
                }
            }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(e.getMessage());

        }finally{

            try{
                if(preparedStatement1 != null)preparedStatement1.close();
                if(preparedStatement2 != null)preparedStatement2.close();
                if(connection != null)connection.close();
                sc.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}