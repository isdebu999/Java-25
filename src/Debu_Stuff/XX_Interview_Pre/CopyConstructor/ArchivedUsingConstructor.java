package Debu_Stuff.XX_Interview_Pre.CopyConstructor;


//Java doesn't Copy Constructor .. but it can archived using 3 ways -
//1> Using Constructor
//2> Using Cloneable Interface
//2> By assign one value one obj to another obj

class Phone {

    String name;
    int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Phone(Phone p) {
        name = p.name;
        price = p.price;
    }

    public void phoneDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class ArchivedUsingConstructor {
    public static void main(String[] args) {

        Phone p1 = new Phone("Samsung", 10000);
        Phone p2 = new Phone(p1); //this is copy constructor...

        p1.phoneDetails();
        p2.phoneDetails();
    }
}
