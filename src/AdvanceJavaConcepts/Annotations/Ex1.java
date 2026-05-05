package AdvanceJavaConcepts.Annotations;

@Deprecated //simple means when u'r not use this  ...
class A {
    public void showTheData() {
        System.out.println("A class Show!");
    }
}

class B extends  A {

    @Override
    public void showTheData(){
        System.out.println("B class Show!");
    }
}

public class Ex1 {
    public static void main(String[] args) {

        B obj = new B();
        obj.showTheData();
    }
}
