package functions_4;

import java.util.Scanner;

public class PythogoreanTriplets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();

        System.out.print("Enter num1: ");
        int num2 = input.nextInt();

        System.out.print("Enter num1: ");
        int num3 = input.nextInt();

        boolean isPythogoreanTriplets = checkPythogoreanTriplets(num1, num2, num3);

        if (isPythogoreanTriplets){
            System.out.println("The numbers are Pythagorean triplets");
        }else {
            System.out.println("The numbers are not Pythagorean triplets");
        }

    }

    static boolean checkPythogoreanTriplets(int num1, int num2, int num3) {
        return Math.pow(num1,2) + Math.pow(num2,2) == Math.pow(num3,2);
    }
}
