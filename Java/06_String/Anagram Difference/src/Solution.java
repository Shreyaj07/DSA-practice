import java.util.* ;
import java.io.*; 
public class Solution {
	public static void main(String[] args) {
		System.out.println(getMinimumAnagramDifference("except", "accept"));
	}
	public static int getMinimumAnagramDifference(String str1, String str2) {
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		for(char c: str1.toCharArray()){
			freq1[c-'a']++;
		}
		for(char c: str2.toCharArray()){
			freq2[c-'a']++;
		}
		int step=0;
		for(int i =0; i<26; i++){
			step+=  Math.abs(freq1[i] - freq2[i]);
		}
		return step/2;
	}
}