import java.util.Arrays;

public class Solution {
    public int[][] zeroMatrix(int[][] matrix, int rows, int columns) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (matrix[row][col] == 0) {
                    markRow(matrix, col, rows);
                    markCol(matrix, row, columns);
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public void display(int[][] matrix) {
        for (int[] rows : matrix) {
            System.out.println(Arrays.toString(rows));
        }
    }

    private void markCol(int[][] matrix, int row, int columns) {
        for (int i = 0; i < columns; i++) {
            if (matrix[row][i] != 0) {
                matrix[row][i] = -1;
            }
        }
    }

    private void markRow(int[][] matrix, int col, int rows) {
        for (int i = 0; i < rows; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }
}
