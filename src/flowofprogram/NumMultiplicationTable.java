package flowofprogram;

import java.util.Scanner;

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
