package functions_4;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        int numreverse = reversenum(num);

        System.out.println("Reverse of "+num+" is "+numreverse);

    }

    static int reversenum(int num) {
        int digits = 0, reversenumber = 0, last;
        int temp = num;

        while(temp > 0){
            temp = temp / 10;
            digits++;
        }
        temp = num;

        while(temp > 0){
            last = temp % 10;
            digits --;
            reversenumber += last * Math.pow(10, digits);
            temp = temp / 10;
        }
        return reversenumber;
    }
}
