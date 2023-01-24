package functions_4;

import java.util.Scanner;

public class PrimeNumbersBetweenARange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();

        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        primenumbers(num1, num2);

    }

    private static void primenumbers(int num1, int num2) {
        for (int i = num1; i <= num2; i++){
            int isPrime = 0;
            for (int c = 2; c <= Math.sqrt(i); c++){
                if(i % c ==0){
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0){
                System.out.print(i+" ");
            }
        }
    }
}
