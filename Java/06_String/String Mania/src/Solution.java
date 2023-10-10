import java.util.* ;
import java.io.*; 
public class Solution {
	public static int stringMania(int n, int m, String str1, String str2) {
	int min = Math.min(m, n);

        for (int i = 0; i < min; i++) {
            char s1 = str1.charAt(i);
            char s2 = str2.charAt(i);

            if (s1 != s2) {
                return s1 > s2 ? 1 : -1;
            }
        }

        return Integer.compare(n, m);
	}
}