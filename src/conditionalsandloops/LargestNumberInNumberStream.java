package conditionalsandloops;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all
public class LargestNumberInNumberStream {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while (true){
            int num = in.nextInt();
            if (num == 0){
                break;
            }else {
                if(num > max){
                    max = num;
                }
            }
        }
        System.out.println("Max number: "+max);
    }
}
