package functions_4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        int answer = factorical(num);

        System.out.println("Factorial: "+answer);
    }
    static int factorical(int num) {
        int factorial = 1;
        if (num == 0){
            return 1;
        }else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
