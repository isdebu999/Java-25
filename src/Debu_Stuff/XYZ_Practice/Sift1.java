package Debu_Stuff.XYZ_Practice;

import java.util.Scanner;

public class Sift1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //min charge..

        String input = sc.next();
        String[]inputArr = input.split(" ");

        int[]arr = new int[inputArr.length];
        for(int i=0;i<inputArr.length;i++){
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println(countLaptopCharge(arr, N));
    }

    public static int countLaptopCharge(int[]arr, int minCharge){

        int cnt = 0;
        for(int xx : arr){
            if(xx >= minCharge){
                cnt++;
            }
        }
        return cnt;
    }
}
