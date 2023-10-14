//https://www.codingninjas.com/studio/problems/pascal-case-of-a-given-sentence_1536787?leftPanelTab=1&count=25&page=4&search=&sort_entity=order&sort_order=ASC

import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static String pascalCase(String inputString) 
    {
		inputString = inputString.trim();
		String[] s = inputString.split(" ");
		String pascal = "";
		for(int i=0; i<s.length;i++){
			pascal+=String.valueOf(s[i].charAt(0)).toUpperCase();
			pascal+= s[i].substring(1);
		}
		return pascal;
	}
}