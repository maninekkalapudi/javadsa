package Arrays_5;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;

public class NumberSmallerThanCurrentNumber {
    public static void main(String[] args) {
//        int[] nums = {8,1,2,2,3};

        int[] nums = {6,5,4,8};

        System.out.println(Arrays.toString(smallerthancurrent(nums)));
    }

    private static int[] smallerthancurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int numcount = 0;
            int j = nums.length-1;
            while (j >= 0){
                if(nums[i] > nums[j]){
                    numcount += 1;
                }
                j -= 1;
            }
            result[i] = numcount;
        }
        return result;
    }
}
