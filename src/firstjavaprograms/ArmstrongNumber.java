package firstjavaprograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int temp, last, sum = 0, digits = 0;
        temp = num;

        while(temp>0){
            temp = temp/10;
            digits++;
        }

        temp = num;

        while(temp>0){
            last = temp%10;
            sum += (int) Math.pow(last,digits);
            temp = temp/10;
        }

        if(sum==num){
            System.out.println(num+" is an Armstrong Number");
        }else {
            System.out.println(num+" is not an Armstrong Number");
        }
    }
}
