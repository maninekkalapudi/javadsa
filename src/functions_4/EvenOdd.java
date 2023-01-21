package functions_4;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean evenodd = evenodd(num);

        if (evenodd){
            System.out.println(num+" is even");
        }else {
            System.out.println(num+" is odd");
        }
    }

    static boolean evenodd(int num) {
        return num%2 == 0;
    }
}
