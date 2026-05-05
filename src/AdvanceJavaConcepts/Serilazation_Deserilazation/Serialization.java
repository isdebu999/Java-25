package AdvanceJavaConcepts.Serilazation_Deserilazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {


        // ++++++ HERE, WE ARE PERFORMING "SERIALIZATION +++++++"
        Student student = new Student(
                101, "Debu", 22, 79
        );

        String path = "/Users/debapriyodas/Desktop/test/student.txt";

        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(student);

        System.out.println("SERIALIZATION OVER!!");
        oos.close();
        fos.close();
    }
}
