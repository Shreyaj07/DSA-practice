import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
	    // Write your code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n--;
		for(int i =n; i>=0; i--){
			for(int j=0; j<n-i;j++){
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}