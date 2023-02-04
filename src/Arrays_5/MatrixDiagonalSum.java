package Arrays_5;

//https://leetcode.com/problems/matrix-diagonal-sum/

public class MatrixDiagonalSum {
    public static void main(String[] args) {
//        int[][] mat = {{1,2,3},
//                       {4,5,6},
//                       {7,8,9}};
        int[][] mat = {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};

        System.out.println(diagonalSum(mat));
    }

    private static int diagonalSum(int[][] mat) {
        int sumDiagonal = 0;

        for (int i = 0; i < mat.length; i++) {
           sumDiagonal += mat[i][i] + mat[i][mat.length-i-1];
        }
        if(mat.length %2 == 0){
            return  sumDiagonal;
        }else {
            return sumDiagonal - mat[mat.length/2][mat.length/2];
        }
    }

}
