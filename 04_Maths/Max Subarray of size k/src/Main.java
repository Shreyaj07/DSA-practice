import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        System.out.println(Arrays.toString(maxSumSubarray(arr,3)));
    }
    public static int[] maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        if (k <= 0 || k > n) {
            return new int[0]; // Return an empty array if k is invalid.
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        // Calculate the sum of the first k elements.
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = sum;

        // Iterate through the array to find the subarray with the maximum sum.
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k]; // Update the sum by adding the next element and subtracting the first element in the current window.
            if (sum > maxSum) {
                maxSum = sum;
                start = i - k + 1; // Update the starting index of the maximum sum subarray.
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[start + i];
        }

        return result;
    }

}