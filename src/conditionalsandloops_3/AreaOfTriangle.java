package conditionalsandloops_3;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();

        System.out.print("Enter the breadth of the triangle: ");
        int breadth = input.nextInt();

        double areaofatriangle = 0.5 * height * breadth;

        System.out.println("The area of the triangle is: "+areaofatriangle);
    }
}
