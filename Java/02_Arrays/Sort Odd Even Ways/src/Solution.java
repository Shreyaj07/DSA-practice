import java.util.* ;
import java.io.*; 
public class Solution {
	public static void main(String[] args) {
//		System.out.println(oddEvenSort(4,new int[]{0,1,3,2}));
		System.out.println(oddEvenSort(10,new int[]{1 ,2 ,6, 10, 16, 1, 3 ,7, 18, 26}));
	}
	public static int oddEvenSort(int n, int[] arr) {
		// Write your code here.
		int i=0;
		if(isSorted(arr)){
			return 1;
		}
		while(i<arr.length-1){
			if((arr[i]%2==0 && arr[i+1]%2==1) || (arr[i]%2==1 && arr[i+1]%2==0)){
				if(arr[i] > arr[i+1]){
					swap(arr, i, i+1);
				}
				if(isSorted(arr)){
					return 1;
				}
			}
			i++;
		}
		if(isSorted(arr)){
			return 1;
		}
		return 0;
	}

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static boolean isSorted(int[] arr){
		if(arr.length==1 || arr.length==0){
			return true;
		}
		if(arr.length==2){
			return arr[0] < arr[1];
		}
		for(int i=0; i<arr.length-1; i++){
			if(arr[i] > arr[i+1]){
				return false;
			}
		}
		return true;
	}
}
