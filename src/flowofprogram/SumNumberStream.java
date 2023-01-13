package flowofprogram;

import java.util.Scanner;

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
