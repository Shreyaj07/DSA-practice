import java.util.*;

public class Solution {
    public static void markRow(ArrayList<ArrayList<Integer>> matrix, int m, int row) {
        for (int i = 0; i < m; i++) {
            if (matrix.get(row).get(i) != 0) {
                matrix.get(row).set(i, -1);
            }
        }
    }

    public static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int col) {
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(col) != 0) {
                matrix.get(i).set(col, -1);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    markRow(matrix, m, i);
                    markCol(matrix, n, j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }


}
