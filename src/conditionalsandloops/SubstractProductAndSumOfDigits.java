package conditionalsandloops;

import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer

public class SubstractProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int temp, digit, digitsum = 0, digitproduct = 1, diff;
        temp = num;

        while(temp > 0){
            digit = temp%10;
            digitproduct *= digit;
            digitsum += digit;
            temp = temp/10;
        }
        diff = digitproduct - digitsum;

        System.out.println("Difference between product and sum of digits is: "+diff);
    }
}
