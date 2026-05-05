package AdvanceJavaConcepts.Threads;

/*------TWO THREADS SHARE SAME VARIABLES [AVOID RACE CONDITIONS]--------*/

class Counter {

    int cnt;
    public synchronized void increment(){
        cnt++;
    }
}

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable r1 = () -> {
            for(int i = 0;i<10000;i++){
                c.increment();
            }
        };

        Runnable r2 = () ->{
            for(int i = 0;i<10000;i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(c.cnt);
    }
}


//without synchronized keyword, the output will be less than 20000 , it loos some values
// when i make my function synchronized, it will lock the function and only one thread can access it at a time, so it will give the correct output 20000
// the snd thread will wait for the first one to be executed and then it will execute, so the output will be correct 20000