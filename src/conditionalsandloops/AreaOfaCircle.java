package conditionalsandloops;

import java.util.Scanner;

public class AreaOfaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        double areaofacircle = 2 * Math.PI * Math.pow(radius,2);

        System.out.println("The area of the circle is: "+areaofacircle);
    }
}
