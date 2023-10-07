import java.io.*;
import java.util.* ;
//https://www.codingninjas.com/studio/problems/majority-element_842495?topList=45-day-coding-challenge&leftPanelTab=1
public class Solution {
	public static void main(String[] args) {
		int[] arr = {2,3,9,2,2};
		System.out.println(findMajority(arr,arr.length));
		int[] arr1 = {8,5,1,9};
		System.out.println(findMajority(arr1,arr1.length));
	}
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int number =(int) (double) (n / 2);
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<n;i++){
			int val = hm.getOrDefault(arr[i], 0)+1;
			hm.put(arr[i], val);
			if(val > number){
				return arr[i];
			}
		}
		
		return -1;
	}
}