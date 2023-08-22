import java.util.* ;
import java.io.*;
public class Solution {
    public static int findSecondLargest(int n, int[] arr) {
        Arrays.sort(arr);

        int largest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }

        return -1;
    }
}