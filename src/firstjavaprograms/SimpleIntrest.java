package firstjavaprograms;

import java.util.Scanner;

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
