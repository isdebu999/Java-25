package AdvanceJavaConcepts.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MyClass3 {
    public static void main(String[] args) {

        String path1 = "/Users/debapriyodas/Desktop/test/input.txt";
        String path2 = "/Users/debapriyodas/Desktop/test/output.txt";

        FileReader fr = null;
        FileWriter fw = null;

        BufferedReader br = null;
        BufferedWriter bw = null;

        try{
            fr = new FileReader(path1);
            fw = new FileWriter(path2);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            String data;
            while((data = br.readLine()) != null){
                bw.write(data);
                //System.out.println(data);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {

            System.out.println("DATA STORE SUCCESSFULLY!!");
           try{
               if(br != null){br.close();}
               if(bw != null){bw.close();}
               if(fr != null){fr.close();}
               if(fw != null){fw.close();}
           }catch (Exception e){
               throw new RuntimeException(e);
           }
        }
    }
}
