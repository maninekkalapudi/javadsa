package firstjavaprograms;

import java.util.Scanner;

public class NumOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        System.out.println("Enter operator: ");
        String operator = input.next();

        switch (operator) {
            case "+":
                System.out.println("Sum of two numbers is " + (num1 + num2));
                break;
            case "-":
                System.out.println("Difference of two numbers is " + (num1 - num2));
                break;
            case "*":
                System.out.println("Product of two numbers is " + (num1 * num2));
                break;
            case "/":
                System.out.println("Division of two numbers is " + (num1 / num2));
                break;
            default:
                System.out.println("Wrong Operator!");
                break;
        }
    }
}
