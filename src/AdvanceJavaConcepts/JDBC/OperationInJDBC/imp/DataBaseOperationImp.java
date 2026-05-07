package AdvanceJavaConcepts.JDBC.OperationInJDBC.imp;

import AdvanceJavaConcepts.JDBC.OperationInJDBC.entity.Student;
import AdvanceJavaConcepts.JDBC.OperationInJDBC.StudentDbOperation;
import AdvanceJavaConcepts.JDBC.OperationInJDBC.dbUtility.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DataBaseOperationImp implements StudentDbOperation {

    Connection connection = DBConnection.getConnection();

    public DataBaseOperationImp() throws Exception {}


    @Override
    public void insertStudent(Student student) {
        String QUERY = "INSERT INTO Student VALUES (?, ?, ?)";
        try{
            PreparedStatement preparedStatement =
                    connection.prepareStatement(QUERY);

            preparedStatement.setInt(1, student.id());
            preparedStatement.setString(2, student.name());
            preparedStatement.setInt(3, student.marks());

            int row = preparedStatement.executeUpdate();
            if(row > 0){
                System.out.println("inserted row(s) " + row);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean findStudentById(int id) {
        String QUERY = "SELECT * FROM Student WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return true;
            }
            return false;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public void deleteStudent(int id) {

        String QUERY = "DELETE FROM Student WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setInt(1, id);
            int row = preparedStatement.executeUpdate();
            if(row > 0){
                System.out.println("deleted row(s) " + row);
            }else{
                System.out.println("Student not found!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getAllStudents() {

        String QUERY = "SELECT * FROM Student";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Student student = new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("student_name"),
                        resultSet.getInt("marks")
                );
                System.out.println(student);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateStudent(Student student) {

        String QUERY = "UPDATE Student SET student_name = ?, marks = ? WHERE id = ?";

        try {

            PreparedStatement preparedStatement =
                    connection.prepareStatement(QUERY);

            preparedStatement.setString(1, student.name());
            preparedStatement.setInt(2, student.marks());
            preparedStatement.setInt(3, student.id());

            int row = preparedStatement.executeUpdate();

            if (row > 0) {
                System.out.println("Updated row(s): " + row);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
