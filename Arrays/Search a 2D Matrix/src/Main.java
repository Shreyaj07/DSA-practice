//Leetcode 24: Search a 2d matrix

import java.util.Arrays;
//Time complexity: O(log(m*n))
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        boolean result = solution.searchMatrix(arr,3);
        System.out.println("Target: 3\nMatrix: ");
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println("Found: "+result);
    }
}