package AdvanceJavaConcepts.Serilazation_Deserilazation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String path = "/Users/debapriyodas/Desktop/test/student.txt";


        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student student = (Student) ois.readObject();

        System.out.println("DESERIALIZATION OVER !!");
        System.out.println(student);
    }
}
