package Debu_Stuff.XYZ_Practice;

import java.util.*;


class Pair {
    int number;
    int frq;

    public Pair(int number, int frq) {
        this.number = number;
        this.frq = frq;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "number=" + number +
                ", frq=" + frq +
                '}';
    }
}

public class TCSQuestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        int[]arr = new int[n];
//
//        for(int i = 0;i<n;i++)arr[i]=sc.nextInt();

        int[]arr = {
                201, 202, 203, 203, 203, 202, 202, 204, 201, 201
        };

        sortBaseOnFrq(arr);

    }

    public static void sortBaseOnFrq(int[]arr){


        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println("MAP : " + map);

        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a,b) -> {
                    return b.frq - a.frq;
                }
        );

        for(int x : map.keySet()){
            int ele = x;
            int frq =  map.get(x);

            pq.offer(new Pair(ele, frq));
        }

        System.out.println("PQ : " + pq);
    }
}
