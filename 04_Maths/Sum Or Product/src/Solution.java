//https://www.codingninjas.com/studio/problems/sum-or-product_920478?leftPanelTab=0
import java.util.* ;
import java.io.*; 
public class Solution {

	public static long sumOrProduct(int n, int q) {

		// Write your code here
		long mod = (long)(Math.pow(10, 9)+7);
		if(q==1){
			return (long)(n*(n+1)/2)%(mod);
		}else if(q==2){
			long fact = 1;
			for(int i=1; i<=n; i++){
				fact*=i;
				fact = fact %mod;
			}
			return fact;
		}
		return 0;
	}
}
