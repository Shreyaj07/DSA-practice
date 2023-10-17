//https://www.codingninjas.com/studio/problems/ninja-and-the-rows_3751635?leftPanelTab=0&count=25&search=&sort_entity=order&sort_order=ASC&page=2

import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{2,0,0}};
        System.out.println(maximumWeightRow(mat.length, mat[0].length, mat));
    }

    public static int maximumWeightRow(int n, int m, int[][] mat) {
        // Write your code here.
        int maxSum = Integer.MIN_VALUE;
        int ans = 0;
        for(int row=0; row<n; row++){
            int sum = 0;
            for(int col=0; col<m; col++){
                sum+=mat[row][col];
            }
           maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}