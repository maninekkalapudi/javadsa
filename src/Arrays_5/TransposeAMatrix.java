package Arrays_5;

//https://leetcode.com/problems/transpose-matrix/

import java.util.Arrays;

public class TransposeAMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] matrix = {{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(matrixTranspose(matrix)));
    }

    private static int[][] matrixTranspose(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int j = 0;
            while (j < matrix[i].length){
                transposedMatrix[j][i] = matrix[i][j];
                j += 1;
            }
        }

        return transposedMatrix;
    }
}
