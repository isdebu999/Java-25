package OppsV2.AbsttactKeyWord;

abstract class Car {

    Car(){
        System.out.println("Abstract Class Constructor is called!!");
    }

    public abstract void speed();

    public void info(){
        System.out.println("This is car Class!!");
    }
}

class Bike extends Car {
    public void speed(){
        System.out.println("Bike speed is 100km/h");
    }

    public void info(){
        System.out.println("This is car Class!!");
    }
}



public class Main {

    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.info();

        //Learn...
        //You can't create of abstract class Constructor..
        //When ever u r creating object of child class the parent class constructor is called!!
    }
}
