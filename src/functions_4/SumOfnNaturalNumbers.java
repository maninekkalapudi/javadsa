package functions_4;

import java.util.Scanner;

public class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = input.nextInt();

        int sumofnaturalnumbers = (num*(num+1))/2;

        System.out.println("Sum of "+num+" natural numbers is: "+sumofnaturalnumbers);
    }
}
