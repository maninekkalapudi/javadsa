package Arrays_5;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;

public class KidsWithHighestCandy {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(highestCandy(candies, extraCandies));
    }

    private static ArrayList<Boolean> highestCandy(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int a: candies) {
            if(a > max){
                max = a;
            }
        }
        for(int item : candies){
            if (item + extraCandies >= max){
                arr.add(true);
            }else {
                arr.add(false);
            }
        }
        return arr;
    }
}
