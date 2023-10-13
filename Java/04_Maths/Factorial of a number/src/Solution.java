import java.math.*;

public class Solution {
	public static void main(String[] args) {
		factorial(35);
		factorial(5);
		factorial(50);
		factorial(500);
	}
	public static void factorial(int n) {
		// Write your code here
		BigInteger factorial = BigInteger.ONE;
		for(int i=1; i<=n; i++){
			factorial  = factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorial);
	}
}
