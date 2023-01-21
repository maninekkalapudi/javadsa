package flowofprogram_1;

import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

public class SumNumberStream {
    public static void main(String[] args) {
        int sum = 0;
        String num;
        Scanner numstream = new Scanner(System.in);

        while(true) {
           num = numstream.nextLine();
            if (!num.equals("x")) {
                sum = sum + Integer.parseInt(num);
//                System.out.println(sum);
            }else {
                break;
            }
        }
        System.out.println("Sum "+sum);

    }
}
