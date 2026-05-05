package AdvanceJavaConcepts.Threads;

//class Z { //parent class }


class A extends  Thread{

    public void run(){
        for(int i = 0;i<50;i++){
            System.out.println("Hi !");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends  Thread{
    public void run(){
        for(int i= 0;i<50;i++){
            System.out.println("Bye :(");
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

//class A implements Runnable{
//
//    public void run(){
//        for(int i = 0;i<50;i++){
//            System.out.println("Hi !");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class B implements Runnable{
//
//    public void run(){
//        for(int i = 0;i<50;i++){
//            System.out.println("Hello :(");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}






public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

//        A obj1 = new A();
//        B obj2 = new B();



//        System.out.println(obj1.getPriority());
        //you can also set the thread priority according to your need.
//        obj2.setPriority(Thread.MAX_PRIORITY);

//        obj1.start();

//        try{
//            Thread.sleep(5);
//        }catch (Exception e){              ---> The best way to handle it is put the exception at main method signature
//            throw new RuntimeException(e);
//        }

//        Thread.sleep(5);


//        obj2.start();



//        Runnable obj1 = new A();
//        Runnable obj2 = new B();

        Runnable obj1 = () -> {
            for(int i = 0;i<50;i++){
                System.out.println("Hi !");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                }
            }

        };

        Runnable obj2 = () -> {
             for(int i = 0;i<50;i++){
                System.out.println("Bye :(");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
             }
        };



        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

/*
    *   In every thread there must be a run method.
    *   Range of priority goes 1 - 10 (1 is least priority and 10 is the highest priority) and 5 is default priority.
    *   Now, there is a problem here - If 'A' class does have a parent class 'Z' then how 'A' extends it,
        it's already extends Thread class and in java multiple inheritance doesn't support ?

         Sol : - > To solve this problem we can use Runnable interface instead of Thread class, and then we can extend any class we want and also implement Runnable interface.

     *
*/
