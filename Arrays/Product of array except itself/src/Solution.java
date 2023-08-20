import java.util.Arrays;

public class Solution {

    public static int[] getProductArrayExceptSelf(int[] arr) {
        int n = arr.length;
        int left = 1;
        int right = 1;
        int[] leftProduct = new int[n];
        for(int i =0; i<n; i++){
            leftProduct[i] = left;
            left*= arr[i];
        }
        int[] result = new int[n];
        for(int i =n-1; i>=0;i--){
            result[i] = leftProduct[i]*right;
            right *= arr[i];
        }
        return result;
    }

}