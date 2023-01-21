package functions_4;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int age = input.nextInt();

        boolean iseligible = eligible(age);

        if (iseligible){
            System.out.println("Candidate is eligible to vote");
        }else {
            System.out.println("Candidate is not eligible to vote");
        }
    }

    static boolean eligible(int age) {
        return age >= 18;
    }
}
