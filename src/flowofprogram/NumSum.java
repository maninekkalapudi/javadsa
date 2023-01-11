package flowofprogram;

import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter num2: ");
        int n2 = num2.nextInt();

        int sum = n1+n2;
        System.out.println("Sum of "+n1+" and "+n2+" is "+sum);
    }
}
