package conditionalsandloops_3;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the rectangle: ");
        int height = input.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = input.nextInt();

        double areaofarectangle = height * breadth;

        System.out.println("The area of the rectangle is: "+areaofarectangle);
    }
}
