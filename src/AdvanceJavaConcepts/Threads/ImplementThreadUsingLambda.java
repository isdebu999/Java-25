package AdvanceJavaConcepts.Threads;

public class ImplementThreadUsingLambda {
    public static void main(String[] args) {

        Runnable obj1 = () -> {

            for(int i = 0;i<=10;i++){
                System.out.println("Hi!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        Runnable obj2 = () -> {

            for(int i = 0;i<=10;i++){
                System.out.println("Debu...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
