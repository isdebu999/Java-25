package Debu_Stuff.XYZ_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnComparable {
    public static void main(String[] args) {

        List<Phone> phones = new ArrayList<>(List.of(
                new Phone("Moto Edge 60 fusion", 20000),
                new Phone("Samsung m10", 10000),
                new Phone("Poco X3", 15000),
                new Phone("Apple i-phone", 50000)
        ));

        Collections.sort(phones);
        System.out.println(phones);
    }
}

class Phone implements Comparable<Phone>{
    String name;
    int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone [name=" + name + ", price=" + price + "]";

    }

    @Override
    public int compareTo(Phone o) {
        return  o.price - this.price;
    }
}
