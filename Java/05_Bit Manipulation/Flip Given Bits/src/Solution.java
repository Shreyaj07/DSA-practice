import java.util.* ;
import java.io.*; 
public class Solution {
	public static void main(String[] args) {
		System.out.println(flipSomeBits(21,new int[]{4,2,1},3));
	}
	
	public static int flipSomeBits(int num, int[] arr, int n) {
		// Write your code here.
		String b = Integer.toBinaryString(num);
		for(int i=0; i<n; i++){
			b = b.replace(b.charAt(arr[i]), (char) (arr[i]==1? 0:1));
		}
		return Integer.parseInt(b);
	}
	
}	