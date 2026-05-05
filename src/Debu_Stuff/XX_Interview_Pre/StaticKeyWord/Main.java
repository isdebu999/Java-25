package Debu_Stuff.XX_Interview_Pre.StaticKeyWord;

class Student {
    String name;
    int age;

    static String collegeName = "NCIT";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void studentDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("College Name: " + this.collegeName);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Debu", 21);
        Student s2 = new Student("Ramesh", 24);

        s1.studentDetails();
        s1.studentDetails();
    }
}
