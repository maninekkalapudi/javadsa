package functions_4;

import java.util.Scanner;

public class SumWithFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();

        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        int sum = adder(num1, num2);

        int product = multiplier(num1, num2);

        System.out.println("Sum: "+sum);

        System.out.println("Product: "+product);

    }

    static int multiplier(int num1, int num2) {
        return num1 * num2;
    }

    static int adder(int a, int b){
        return a+b;
    }
}
