package firstjavaprograms_2;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle: ");
        int principle = input.nextInt();

        System.out.print("Enter time period: ");
        int time = input.nextInt();

        System.out.print("Enter time rate of interest: ");
        int roi = input.nextInt();

        double simpleintrest = (principle * time *roi)/100.0;
        System.out.println("Simple Interest is: "+simpleintrest);

    }
}
