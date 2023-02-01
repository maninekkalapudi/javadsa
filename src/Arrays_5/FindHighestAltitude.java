package Arrays_5;

//https://leetcode.com/problems/find-the-highest-altitude/

public class FindHighestAltitude {
    public static void main(String[] args) {
//        int[] gain = {-5,1,5,0,-7};
        int[] gain = {-4,-3,-2,-1,4,3,2};

        System.out.println(highestAltitude(gain));
    }

    private static int highestAltitude(int[] gain) {
        int maxAltitude = 0, sum = 0;
        for (int j : gain) {
            sum += j;
            if (sum > maxAltitude) maxAltitude = sum;
        }
        return maxAltitude;
    }
}
