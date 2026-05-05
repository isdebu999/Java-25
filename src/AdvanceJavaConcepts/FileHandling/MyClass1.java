package AdvanceJavaConcepts.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyClass1 {
    public static void main(String[] args) throws IOException {

        //String path1;
        //String path2;

        //path1 = "/Users/debapriyodas/Desktop/test/input.txt";
        //path2 = "/Users/debapriyodas/Desktop/test/output.txt";


        FileInputStream fis = new FileInputStream("/Users/debapriyodas/Desktop/test/input.txt");
        FileOutputStream fos = new FileOutputStream("/Users/debapriyodas/Desktop/test/output.txt");

//        int data;
//        while((data = fis.read()) != -1){
//            fos.write(data);
//        }

        //instated of doing this it can be done also this way...
        fis.transferTo(fos); // -- this is one liner..

        System.out.println("DATA STORE SUCCESSFULLY!!");
        fis.close();
        fos.close();
    }
}
