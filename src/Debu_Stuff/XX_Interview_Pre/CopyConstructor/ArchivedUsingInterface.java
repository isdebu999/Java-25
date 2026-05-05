package Debu_Stuff.XX_Interview_Pre.CopyConstructor;

class Laptop implements Cloneable{
    String model;
    int price;

    Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }


    public void laptopDetails() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    @Override
    public Laptop clone() throws CloneNotSupportedException{
        return (Laptop) super.clone();
    }
}

public class ArchivedUsingInterface {
    public static void main(String[] args) throws CloneNotSupportedException {

        Laptop l1 = new Laptop("Macbook Air" , 850000);

        l1.laptopDetails();

        Laptop l2 = l1.clone();
        l2.laptopDetails();
    }
}
