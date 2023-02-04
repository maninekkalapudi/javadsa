package Arrays_5;

//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

public class CellsWithOddValuesInMatrix {
    public static void main(String[] args) {
//        int m = 2, n = 3;
//        int[][] indices = {{0,1},{1,1}};
        int m = 2, n = 2;
        int[][] indices = {{1,1},{0,0}};

        System.out.println(incrementMatrixWithIndices(m, n, indices));
    }

    private static int incrementMatrixWithIndices(int m, int n, int[][] indices) {
        int[][] answer = new int[m][n];
        int odds = 0;

        for (int[] index : indices) {
            for (int j = 0; j < index.length; j++) {
                int k = 0;
                if (j == 0) {
                    while (k < answer[0].length) {
                        answer[index[j]][k] += 1;
                        k += 1;
                    }
                } else {
                    while (k < answer.length) {
                        answer[k][index[j]] += 1;
                        k += 1;
                    }
                }
            }
        }

        for (int[] ints : answer) {
            for (int j : ints) {
                if (j % 2 != 0) {
                    odds += 1;
                }
            }

        }

        return odds;
    }
}
