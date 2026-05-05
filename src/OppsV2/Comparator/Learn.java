package OppsV2.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int age;
    String name;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Learn {
    public static void main(String[] args) {

        Comparator<Integer> c = new Comparator<Integer>() {

            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(43, 31, 72, 29));
//        Collections.sort(list, c);

        Comparator<Student> c1 = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.age > s2.age){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        ArrayList<Student> list = new ArrayList<>();


        list.add(new Student(23, "Rohit"));
        list.add(new Student(21, "Sohit"));
        list.add(new Student(27, "Mohit"));
        list.add(new Student(29, "Daniel"));

        Collections.sort(list, c1);
        
        for(Student s: list){
            System.out.println(s);
        }
    }
}
