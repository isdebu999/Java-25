package Debu_Stuff.XYZ_Practice;

import java.util.HashSet;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

     
}

public class JCF_Learning {

    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();
        set.add(new Student(1, "Jack"));
        set.add(new Student(1, "Jack"));

        System.out.println("SET : " + set);
    }
}
