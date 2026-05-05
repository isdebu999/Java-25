package Debu_Stuff.XX_Interview_Pre.StaticKeyWord;


class Calculate {

    public static int cube(int x){
        return x*x*x;
    }
}

class Counter {

    static int cnt = 0;

    public Counter() {
        cnt++;
        System.out.println(cnt);
    }
}

public class CounterTest {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        int res = Calculate.cube(6);
        System.out.println(res); //this means static method can be called without creating an object of the class
    }
}
