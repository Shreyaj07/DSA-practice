import java.util.* ;
import java.io.*;
//https://www.codingninjas.com/studio/problems/rearrange-string_985247?leftPanelTab=0&count=25&page=3&search=&sort_entity=order&sort_order=ASC
public class Solution {
	public static void main(String[] args) {
		System.out.println(rearrangeString("aac"));
		System.out.println(rearrangeString("azzz"));
		System.out.println(rearrangeString("abbc"));
		System.out.println(rearrangeString("yaxx"));
	}
	public static String rearrangeString(String str) {
		// Write your code here.
		char[] ch = str.toCharArray();
		for(int i=0; i<str.length()-2; i++){
			if(ch[i]==ch[i+1]){
				swap(ch,i+1,i+2);
			}
		}
		return Arrays.toString(ch);
	}
	public static void swap(char[] arr, int i, int j){
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
}