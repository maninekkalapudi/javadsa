package Arrays_5;

// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{3,2,1}};

          int[][] arr = {{1,5},{7,3},{3,5}};

        System.out.println(richestCustomer(arr));
    }

    static int richestCustomer(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
