import java.util.* ;
import java.io.*; 
public class Solution {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		Solution.inplaceRotate(arr, arr.length);
	}

	public static void inplaceRotate(int[][] arr, int n) {
		for(int i=0; i<n; i++){
			for(int j=0; j<n/2; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[i][n-1-j];
				arr[i][n-1-j] = temp;
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<i; j++){
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i] = temp;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}