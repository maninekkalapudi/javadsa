package firstjavaprograms_2;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.next();
        System.out.println("Hello, "+name);
    }
}
