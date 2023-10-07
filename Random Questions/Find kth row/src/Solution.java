//https://www.codingninjas.com/studio/problems/find-row-k_920510?topList=45-day-coding-challenge
import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,1},
                {0,1,0},
                {1,1,0}
        };
        System.out.println(findRowK(arr));
    }

    public static int findRowK(int[][] mat) {
        // Write your code here.
        // row -> 0 col -> 1
        for(int diagonal=0; diagonal<mat.length; diagonal++){
                if(allRows0(diagonal,mat) && allColumns1(diagonal,mat)){
                    return diagonal;
                }
        }
        return -1;
    }
    public static boolean allColumns1(int col, int[][] matrix){
        for(int i=0; i<matrix[0].length; i++){
            if(i==col){
                continue;
            }
            if(matrix[i][col] != 1){
                return false;
            }
        }
        return true;
    }
    public static boolean allRows0(int row, int[][] matrix){
        for(int i=0; i<matrix[0].length; i++){
            if(i==row){
                continue;
            }
            if(matrix[row][i] != 0){
                return false;
            }
        }
        return true;
    }
}