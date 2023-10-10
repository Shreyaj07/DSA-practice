import java.util.*;
public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int lastElementOfFirstRow = mat.get(0).get(m - 1);
        for (int i = m - 1; i > 0; i--) {
            mat.get(0).set(i, mat.get(0).get(i - 1));
        }
        for (int j = 1; j < n; j++) {
            int temp = mat.get(j).get(m - 1);
            mat.get(j).set(m - 1, lastElementOfFirstRow);
            lastElementOfFirstRow = temp;
        }
        for (int i = m - 2; i >= 0; i--) {
            int temp = mat.get(n - 1).get(i);
            mat.get(n - 1).set(i, lastElementOfFirstRow);
            lastElementOfFirstRow = temp;
        }
        for (int i = n - 2; i > 0; i--) {
            int temp = mat.get(i).get(0);
            mat.get(i).set(0, lastElementOfFirstRow);
            lastElementOfFirstRow = temp;
        }
        mat.get(0).set(0, lastElementOfFirstRow);
    }
}
