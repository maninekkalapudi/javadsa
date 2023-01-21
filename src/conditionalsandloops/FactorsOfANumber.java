package conditionalsandloops;

import java.util.Scanner;

//Input a number and print all the factors of that number

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for(int i =1; i<=Math.sqrt(num); ++i){
            if(num%i == 0){
                if(i == num/i){
                    System.out.print(i+", ");
                }else {
                    System.out.print(i+", "+num/i+", ");
                }
            }
        }
    }
}
