package Arrays_5;

//https://leetcode.com/problems/number-of-good-pairs/

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        System.out.println(goodPairs(nums));
    }

    private static int goodPairs(int[] nums) {
        int numGoodPairs = 0, i;
        for (i = 0; i < nums.length; i++) {
            int j = nums.length-1;
            while (i < j){
                if(nums[i] == nums[j]){
                    numGoodPairs += 1;
                }
                j -= 1;
            }
        }
        return numGoodPairs;
    }
}
