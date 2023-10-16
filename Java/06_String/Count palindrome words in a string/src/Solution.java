import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void main(String[] args) {
        
    }
    public static int countNumberOfPalindromeWords(String s) 
	{
        int count = 0;
        s = s.trim();
        if(s.length()==0){
            return 0;
        }
        String[] words = s.split("\\s+");

        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }

        return count;
    }
      public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder reversed = new StringBuilder(s).reverse();
        return s.contentEquals(reversed);
    }
}