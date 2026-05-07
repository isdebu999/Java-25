package AdvanceJavaConcepts.JDBC.OperationInJDBC;

import AdvanceJavaConcepts.JDBC.OperationInJDBC.entity.Student;

public interface StudentDbOperation {
    void insertStudent(Student student);
    boolean findStudentById(int id);
    void deleteStudent(int id);
    void getAllStudents();
    void updateStudent(Student student);
}
