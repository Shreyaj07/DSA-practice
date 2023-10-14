import java.util.* ;
import java.io.*; 
public class Solution {
	public static void main(String[] args) {
		System.out.println(firstNonRepeating("aabbcdd"));
	}
	public static char firstNonRepeating(String str) {
		// Write your code here
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++){
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i),0)+1);
		}
		for(int i=0; i<str.length(); i++){
			int temp = hm.get(str.charAt(i));
			if(temp==1){
				return str.charAt(i);
			}
		}
		return '#';
	}
}
