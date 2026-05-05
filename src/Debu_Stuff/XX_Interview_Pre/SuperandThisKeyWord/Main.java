package Debu_Stuff.XX_Interview_Pre.SuperandThisKeyWord;


//super() is exist everywhere in every class...

class A {

    public A() {
        System.out.println("This is A!");
    }

    public A(int n) {
        System.out.println("N inside  A!");
    }
}

class B extends A{

    public B() {
        System.out.println("This is B!");
    }

    public B(int n) {
        this(); // call the current class constructor!
        System.out.println("N inside B!");
    }

}

public class Main {
    public static void main(String[] args) {

        B b = new B(5);
    }
}
