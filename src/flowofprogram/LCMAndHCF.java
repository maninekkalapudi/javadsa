package flowofprogram;

import java.util.Scanner;

//Take 2 numbers as inputs and find their HCF and LCM.

public class LCMAndHCF {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter 2nd number: ");
        int n2 = num2.nextInt();

        int temp, temp1, temp2, gcd, lcm;
        temp1 = n1;
        temp2 = n2;

        while (temp2 != 0){
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        gcd = temp1;
        lcm = (n1*n2)/gcd;

        System.out.println("The HCF :"+gcd+" and LCM: "+lcm);

    }
}
