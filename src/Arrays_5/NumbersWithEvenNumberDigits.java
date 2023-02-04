package Arrays_5;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class NumbersWithEvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(evenNumberDigits(nums));
    }

    private static int evenNumberDigits(int[] nums) {
        int numbersWithEvenNumberDigits = 0;

        for (int num: nums) {
            int digits = 0;
            while(num > 0){
                 num = num/10;
                 digits += 1;
            }

            if (digits % 2 == 0){
                numbersWithEvenNumberDigits += 1;
            }
        }

        return numbersWithEvenNumberDigits;
    }
}
