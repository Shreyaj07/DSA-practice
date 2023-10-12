import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTrappedWater(new long[]{3,0,0,2,0,4},6));
        System.out.println(getTrappedWater(new long[]{2,1,1,4},4));
        System.out.println(getTrappedWater(new long[]{8,1,8,2,4},5));
    }
    public static long getTrappedWater(long []arr, int n) {
        // Write your code here.
        long[] left = new long[n];
        long[] right = new long[n];
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i - 1], arr[i]);
            right[n - 1 - i] = Math.max(right[n - i], arr[n - 1 - i]);
        }
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(left));
        long sum =0 ;
        long[] result = new long[n];
        for(int i=1; i<n-1; i++){
            long water = Math.min(left[i],right[i])-arr[i]>0 ? Math.min(right[i],left[i])-arr[i] : 0;
            result[i] = water;
            sum+=water;
        }
        System.out.println(Arrays.toString(result));
        return sum;
    }
}




