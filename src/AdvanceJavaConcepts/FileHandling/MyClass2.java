package AdvanceJavaConcepts.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass2 {
    public static void main(String[] args) throws IOException {

        String path1 = "/Users/debapriyodas/Desktop/test/input.txt";
        String path2 = "/Users/debapriyodas/Desktop/test/output.txt";

        FileReader fr = null;
        FileWriter fw = null;

        try{
            fr = new FileReader(path1);
            fw = new FileWriter(path2);

            int data;

            while ((data = fr.read()) != -1) {
                fw.write(data);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally{
            if(fr != null){fr.close();}
            if(fw != null){fw.close();}
            System.out.println("DATA STORE SUCCESSFULLY!!");
        }
    }
}
