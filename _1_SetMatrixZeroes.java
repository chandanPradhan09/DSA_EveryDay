/*
 * Leat Code Problem No: 73
 * Set Matrix Zeroes
 * -----------------
 * 
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * 
 * Optimal Solution:
 */


class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        // Marking the zero to the 1st row and column in the same matrix. (For optimal
        // solution.)
        int first = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j == 0) {
                        first = 0;
                    } else {
                        matrix[0][j] = 0;
                    }
                }
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (matrix[0][0] == 0) {
            for (int i = 0; i < column; i++)
                matrix[0][i] = 0;
        }
        if (first == 0) {
            for (int i = 0; i < row; i++)
                matrix[i][0] = 0;
        }
    }
}