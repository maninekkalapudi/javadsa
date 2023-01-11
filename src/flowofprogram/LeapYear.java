package flowofprogram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        String year = input.next();

        if (year.length() == 4){
            System.out.println("Valid year");
            int yr = Integer.parseInt(year);
            if (yr % 4 == 0){
                System.out.println(year+" is a leap year");
            }else {
                System.out.println(year+" is not a leap year");
            }
        }else {
            System.out.println("Invalid year! Please enter a valid year");
        }
    }
}
