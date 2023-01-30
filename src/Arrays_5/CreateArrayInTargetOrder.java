package Arrays_5;

//https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.Arrays;

public class CreateArrayInTargetOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};

        System.out.println(Arrays.toString(arrayInTargetFormat(nums, index)));
    }

    private static int[] arrayInTargetFormat(int[] nums, int[] index) {
        int[] target = new int[nums.length];

         for (int i = 0; i < nums.length; i++) {
            target[index[i]] = nums[i];
        }
        return target;
    }
}
