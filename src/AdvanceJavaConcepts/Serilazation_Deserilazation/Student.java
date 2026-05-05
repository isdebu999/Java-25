package AdvanceJavaConcepts.Serilazation_Deserilazation;

import java.io.Serializable;
import java.util.Objects;


//THIS IS CALLED POJO CLASS --
class Student  implements Serializable {

    private int id;
    transient private String name;
    private int age;
    transient private int marks; //suppose i don't want marks to i make it "transient"


    //There are some case where i want that some the data member i don't want to involve in the serilazation.
    //For that i want some keyword to not involve that property into Serialization.
    // KEYWORD - >  "transient"


    public Student(){
        super();
    }

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && marks == student.marks && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, marks);
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}