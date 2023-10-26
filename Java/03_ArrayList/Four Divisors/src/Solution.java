import java.util.* ;
import java.io.*; 
public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(List.of(2,5,6,15));
		System.out.println(sumFourDivisors(al,al.size()));
	}
	public static int sumFourDivisors(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int sum = 0;
		for(int i=0; i<n; i++){
			if(noOfDivisors(arr.get(i)) == 4){
				sum += sumOfDivisors(arr.get(i));
			}
		}
		return sum;
	}
	public static int sumOfDivisors(int n){
		int sum = 0;
		for(int i=1; i<=n; i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;
	}
	public static int noOfDivisors(int n){
		int divisors = 0;
		for(int i=1; i<=n; i++){
			if(n%i==0){
				divisors++;
			}
		}
		return divisors;
	}
}

