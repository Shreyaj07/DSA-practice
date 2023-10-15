import java.io.*;
import java.util.* ;
//https://www.codingninjas.com/studio/problems/set-matrix-zeros_3846774
public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,0,6},{7,8,9}};
        setZeros(matrix);
       for(int[] cols: matrix){
           for(int row: cols){
               System.out.print(row+" ");
           }
           System.out.println();
       }
    }
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(matrix[r][c]==0){
                    setRows(matrix, r, c);
                    setCols(matrix, r, c);
                }
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==-1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void setRows(int[][] matrix, int row, int col){
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[row][i]!=0){
                matrix[row][i]  =-1;
            }
        }
    }
    public static void setCols(int[][] matrix, int row, int col){
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][col]!=0){
                matrix[i][col]  =-1;
            }
        }
    }
}