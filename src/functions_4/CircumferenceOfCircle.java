package functions_4;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = input.nextDouble();

        double circumference = circlecircumference(radius);
        System.out.println("Circumference of circle is: "+circumference);
    }

    private static double circlecircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
