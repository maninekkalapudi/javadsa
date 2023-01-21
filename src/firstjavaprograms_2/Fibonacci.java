package firstjavaprograms_2;

import java.util.Arrays;
import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the series: ");
        int num = input.nextInt();

        int[] fibonicci = new int[num+1];
        fibonicci[0] = 0;
        fibonicci[1] = 1;

        for(int i = 2; i <= num; i++){
            fibonicci[i] = fibonicci[i-1] + fibonicci[i-2];
        }

        System.out.print("Fibonacci series: " + Arrays.toString(fibonicci));
    }
}
