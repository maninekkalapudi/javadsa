package Arrays_5;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        System.out.println(Arrays.toString(shuffleArray(nums, n)));
    }

    private static int[] shuffleArray(int[] nums, int n) {
        int[] arr = new int[nums.length];

        for (int i = 0, j = 0; i < n; i++) {
            arr[j] = nums[i];
            arr [j+1] =  nums[i+n];
            j = j+2;
        }
        return arr;
    }
}
