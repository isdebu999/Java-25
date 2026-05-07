package AdvanceJavaConcepts.JDBC.OperationInJDBC;

import AdvanceJavaConcepts.JDBC.OperationInJDBC.entity.Student;
import AdvanceJavaConcepts.JDBC.OperationInJDBC.imp.DataBaseOperationImp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        DataBaseOperationImp operationImp = new DataBaseOperationImp();


        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Insert Student");
            System.out.println("2. Get All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Find Student By ID");
            System.out.print("6. Exit");
            System.out.println("\n=====================================");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    int marks = sc.nextInt();

                    Student student = new Student(id, name, marks);

                    operationImp.insertStudent(student);
                    break;

                case 2:

                    operationImp.getAllStudents();
                    break;

                case 3:

                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    boolean exists = operationImp.findStudentById(updateId);

                    if (!exists) {
                        System.out.println("Student ID not found in DB!");
                        break;
                    }

                    System.out.print("Enter New Name: ");
                    String updateName = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    int updateMarks = sc.nextInt();

                    Student updatedStudent =
                            new Student(updateId, updateName, updateMarks);
                    operationImp.updateStudent(updatedStudent);
                    break;

                case 4:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();
                    if(!operationImp.findStudentById(deleteId)){
                        System.out.println("Student ID not found in DB!");
                        break;
                    }
                    operationImp.deleteStudent(deleteId);
                    break;

                case 5:

                    System.out.print("Enter Student ID to Find: ");
                    int searchId = sc.nextInt();

                    boolean found = operationImp.findStudentById(searchId);

                    if (found) {
                        System.out.println("Student is in the DB!");
                    } else {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 6:
                    System.out.println("Exiting Application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
