package Debu_Stuff.XYZ_Practice;

import java.util.HashSet;

public class DebuggingPer {
    public static void main(String[] args) {

//        String str = "Java Programming";
//        solve(str);

        int[]arr = {
                100, 4, 200, 1, 3, 2, 101
        };

        System.out.println(longestConsecutive(arr));
    }

    public static void solve(String str){

        String ans = "";
        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                ans+= Character.toLowerCase(ch);
            }else {
                ans+= Character.toUpperCase(ch);
            }
        }
        System.out.println(ans);
    }

    public static int longestConsecutive(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currEle = num;
                int cnt = 1;

                while (set.contains(currEle+1)){
                    currEle++;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }
        }
        return longest;


    }
}
