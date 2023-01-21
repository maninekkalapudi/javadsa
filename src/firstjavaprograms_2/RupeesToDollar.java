package firstjavaprograms_2;

//Input currency in rupees and output in USD.

import java.util.Scanner;

public class RupeesToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount in INR: ");
        int amount = input.nextInt();
        System.out.println("$"+(amount/81.29));
    }

}
