package Debu_Stuff.XYZ_Practice;

import java.util.Scanner;

public class Module5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("CONNECTION ESTABLISHED!");
        try {
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("Result: " + (num1 / num2));

        }catch (Exception e) {
            System.out.println("You can't divide by zero! Please try again.");
        }

        System.out.println("CONNECTION TERMINATED!");
    }
}
