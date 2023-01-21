package conditionalsandloops;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers

public class SumOfNumberStream {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true){
            int num = in.nextInt();
            if (num == 0){
                break;
            }else {
                sum += num;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
