package AdvanceJavaConcepts.FileHandling;

import java.io.File;

public class MyClass4 {
    public static void main(String[] args) {

        File file = new File(
                "/Users/debapriyodas/Desktop/test/input.txt"
        );


//        if(file.exists()){
//            System.out.println("The file exists!");
//        }else{
//            System.out.println("The file doesn't exist!");
//        }

//        if(file.isFile()){
//            System.out.println("This is a file!");
//        }else {
//            System.out.println("This is not a file!");
//        }


        //check is it folder...
//        if(file.isDirectory()){
//               System.out.println("This is a directory");
//        }else{
//            System.out.println("This is not a directory!");
//        }


        //get the absolute path...
        //System.out.println("ABSOLUTE PATH: " + file.getAbsolutePath());

        System.out.println("GET RELATIVE PATH : " + file.getPath());
    }
}
