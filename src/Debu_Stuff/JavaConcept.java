package Debu_Stuff;



public class JavaConcept {
    {

        System.out.println("NSB-1");

    }

    public void eat(){

        System.out.println("Eating");

    }

    static{

        System.out.println("SB-1");

        JavaConcept obj1=new JavaConcept();

        obj1.walk();

    }

    public static void main(String[] args) {

        System.out.println("Main Start");

        JavaConcept obj2 = new JavaConcept();
        obj2.walk();

        System.out.println("Main End");

    }

    static{

        System.out.println("SB-2");

    }

    public void walk(){
        eat();
        System.out.println("walking");

    }

    {

        System.out.println("NBS-2");

    }
}
