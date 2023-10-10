//https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118821/offering/1381900?leftPanelTab=0
/**
 Matrix flip bits
 */

import java.util.* ;
import java.io.*; 
public class Solution {
	public static void main(String[] args) {
		int[][] arr = {
				{1,0,1},
				{1,1,0},
				{1,1,1}
		};
		Solution.countFlip(arr);
	}
	public static void setRows(int[][] matrix,int row){
		for(int col=0; col<matrix.length; col++){
			if(matrix[row][col]!=0){
				matrix[row][col] = -1;
			}
		}
	}
	public static void setCol(int[][] matrix,int col){
		for(int row=0; row<matrix.length; row++){
			if(matrix[row][col]!=0){
				matrix[row][col] = -1;
			}
		}
	}
	public static int countFlip(int[][] matrix) {
		for(int i=0; i<matrix.length; i++){
			//i -> row j-> col
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j]==0){
					setRows(matrix, i);
					setCol(matrix, j);
				}
			}
		}
		int count = 0;
		for(int i=0; i<matrix.length; i++){
			//i -> row j-> col
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j]==-1){
					matrix[i][j] = 0;
					count++;
				}
			}
		}
		System.out.println(Arrays.deepToString(matrix));
		System.out.println(count);
		return count;
	}
}

