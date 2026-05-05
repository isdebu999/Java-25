package Debu_Stuff.XYZ_Practice;

import java.util.HashSet;
import java.util.Objects;

public class LearningDemo {
    public static void main(String[] args) {


        HashSet<Boy> set = new HashSet<>();

        Boy b1 = new Boy("Jit", 22);
        Boy b2 = new Boy("Jit", 22);

        set.add(b1);
        set.add(b2);
        System.out.println(set);

    }
}

class Boy{
    String name;
    int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Boy boy = (Boy) o;
        return age == boy.age && Objects.equals(name, boy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
