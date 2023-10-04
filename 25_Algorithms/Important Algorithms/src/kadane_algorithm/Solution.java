package kadane_algorithm;

class Solution {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{5, 4, -1, -7, 8}));
    }

    public static int maxSubArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        int maxSum = arr[0];
        for (int j : arr) {
            sum += j;
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}