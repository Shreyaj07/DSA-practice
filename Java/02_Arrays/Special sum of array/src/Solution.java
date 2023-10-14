//https://www.codingninjas.com/studio/problems/special-sum-of-array_893340?leftPanelTab=1&count=25&page=7&search=&sort_entity=order&sort_order=ASC

import java.util.* ;
import java.io.*; 
public class Solution{
	public static int specialSum(ArrayList<Integer> arr, int n ){
        // Write your code here.
		int sum = 0;
		for(int i=0; i<n; i++){
			sum+=arr.get(i);
		}
		while(sum > 9){
			int temp = 0;
			int length = (int)Math.log10(sum);
			for(int i=0; i<=length; i++){
				temp += sum%10;
				sum = sum/10;
			}
			sum = temp;
		}
		return sum;
	}
}