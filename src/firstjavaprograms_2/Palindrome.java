package firstjavaprograms_2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuilder reverse = new StringBuilder();
        System.out.print("Enter a String: ");
        String str = input.next();

//        for (int i = 0; i<= str.length()/2; i++){
//            if(str.charAt(i) != str.charAt(str.length()-1-i)){
//                System.out.println(str+" is not a palindrome");
//            }else {
//                System.out.println(str+" is a palindrome");
//            }
//            break;
//        }
        for (int i = (str.length()-1); i >= 0; i--){
            reverse.append(str.charAt(i));
        }

        if(str.equalsIgnoreCase(reverse.toString())){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
