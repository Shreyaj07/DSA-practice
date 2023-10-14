import java.util.*;
import java.io.*;

public class Solution {
    public static int kSmallestInMatrix(int mat[][], int k) {
        // Write your code here..
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m * n];
        int count = 0;

        for (int[] row : mat) {
            for (int element : row) {
                arr[count] = element;
                count++;
            }
        }
        Arrays.sort(arr);
        if (k >= 1 && k <= m * n) {
            return arr[k - 1];
        } else {
            return -1;
        }

    }

}