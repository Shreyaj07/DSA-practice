import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(getProductArrayExceptSelf(arr)));
    }
    public static int[] getProductArrayExceptSelf(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        int[] left = new int[n];
        int prod = 1;
        for(int i=0; i<=n-1; i++){
            left[i] = prod;
            prod = prod * arr[i];
        }
        int right =1;
        for(int i=n-1; i>=0; i--){
            left[i] = left[i]* right;
            right = right*arr[i];
        }
        return left;
    }
}