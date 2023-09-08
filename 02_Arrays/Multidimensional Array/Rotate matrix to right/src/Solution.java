import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
		for(int i=0; i<k%m; i++){
			rotateRight(mat,n,m);
		}
		return mat;
	}
	public static void rotateRight(int[][] arr, int rows, int cols){
		for(int i=0; i<arr.length; i++){
			int temp = arr[i][cols-1];
			for(int j=cols-1; j>0; j--){
				arr[i][j] = arr[i][j-1];
			}
			arr[i][0] = temp;
		}
	}
}