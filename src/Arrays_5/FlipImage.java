package Arrays_5;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
public class FlipImage {
    public static void main(String[] args) {
       int[][] img = {{1,1,0},{1,0,1},{0,0,0}};
//        int[][] img = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        System.out.println(Arrays.deepToString(img));
        System.out.println(Arrays.deepToString(imageflipper(img)));
    }

    private static int[][] imageflipper(int[][] image) {
        int[][] flippedImage = new int[image[0].length][image.length];

        for (int i = 0; i < image.length; i++) {
                int j = 0;
                int k = image[i].length-1;
                while(j <= k) {
//
                if(image[i][j] == 0){
                    flippedImage[i][k] = 1;
                }else{
                    flippedImage[i][k] = 0;
                }

                if(image[i][k] == 0){
                    flippedImage[i][j] = 1;
                }else{
                    flippedImage[i][j] = 0;
                }
                    k -= 1;
                    j += 1;
                }
        }
        return flippedImage;
        }

    }
