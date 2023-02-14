package Arrays_5;

//https://leetcode.com/problems/add-to-array-form-of-integer/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface AddToArrayFormOfInteger {
    static void main(String[] args) {
//        int[] num = {1,2,0,0};
//        int k = 34;

        int[] num = {2,1,5};
        int k = 806;

        System.out.println(addToArrayForm(num, k));
//        addToArrayForm(num);
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int len = num.length-1;
        int adder = k;

        while(len >= 0 || adder > 0){
            if (len >= 0){
                adder += num[len];
            }
            ans.add(adder % 10);
            adder /= 10;
            len -= 1;
        }
        Collections.reverse(ans);
        return ans;
    }
}
