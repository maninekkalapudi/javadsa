package functions_4;

import java.util.Scanner;

public class MinAndMaxOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();

        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        System.out.print("Enter num3: ");
        int num3 = input.nextInt();

        int min = min(num1, num2, num3);

        int max = max(num1, num2, num3);

        System.out.println("Min: "+min+" Max: "+max);
        
    }

    static int min(int a, int b, int c){
        int minimum = a;
        if(b < minimum){
            minimum = b;
        }

        if(c < minimum){
            minimum = c;
        }

        return minimum;
    }

    static int max(int a, int b, int c){
        int maximum = a;
        if(b > maximum){
            maximum = b;
        }

        if(c > maximum){
            maximum = c;
        }

        return maximum;
    }
}
