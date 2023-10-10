//https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118522/offering/1380914?leftPanelTab=0

public class Solution {
	public static void main(String[] args) {
		System.out.println(kthChildNthGeneration(4,4));
		System.out.println(kthChildNthGeneration(4,5));
	}
	public static String kthChildNthGeneration(int n, long k) {
		// Write your code here
		if(n==1){
			return "Male";
		}else{
			String parent = kthChildNthGeneration(n-1,(k+1)/2);
			if(parent=="Male"){
				return (k%2==1)? "Male": "Female";
			}else{
				return (k%2==1)?"Female":"Male";
			}
		}
	}
	
}