package flowofprogram_1;

import java.util.Scanner;

//Take a number as input and print the multiplication table for it.

public class NumMultiplicationTable {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = num.nextInt();

        for(int i=1; i<=10; i++){
            int multiply = number * i;
            System.out.println(number+" * "+i+" = "+multiply);
        }
    }
}
