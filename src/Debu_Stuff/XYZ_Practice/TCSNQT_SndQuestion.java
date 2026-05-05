package Debu_Stuff.XYZ_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class TCSNQT_SndQuestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        int[]arr = new int[n];
//        for(int i = 0;i<n;i++)arr[i] = sc.nextInt();

          int[]arr = {
                  1, 1, 2, 2, 3, 3, 3
          };


    }

    public static void rearrange(int[]arr){

        int n = arr.length;
        // 1, 1, 2, 2, 3, 3, 3
        // i                 j

        // 3, 1, 3, 2, 3 , 1, 2
        ArrayList<Integer>list = new ArrayList<>();
        int i = 0;
        int j = n -  1;

        while(j > i){
            if(arr[i] != arr[j]){
                list.add(arr[j]);

            }
        }
    }
}
