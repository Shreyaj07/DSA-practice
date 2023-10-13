import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getLengthofLongestSubstring("bacda",3));
        System.out.println(bruteForceApproach("bacda",3));
        System.out.println(lessComplexityMethod("bacda",3));
        System.out.println(lessComplexityMethod("abcbc",2));
        System.out.println(lessComplexityMethod("abccc",1));
    }
    public static int bruteForceApproach(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return 0;
        }
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> hm = new HashMap<>();
            int distinct = 0;
            for (int j = i; j < s.length(); j++) {
                char currentChar = s.charAt(j);
                hm.put(currentChar, hm.getOrDefault(currentChar, 0) + 1);

                if (hm.size() <= k) {
                    distinct = Math.max(distinct, j - i + 1);
                } else {
                    break;
                }
            }
            maxLen = Math.max(maxLen, distinct);
        }
        return maxLen;
    }
    public static int getLengthofLongestSubstring(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return 0;
        }

        int left = 0;
        int maxLen = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);

            while (charCount.size() > k) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
    public static int lessComplexityMethod(String s, int k){
        HashMap<Character, Integer> hmap = new HashMap<>();
        int length = 0;
        int prevPtr = 0;
        for(int i=0; i<s.length(); i++){
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0) + 1);
            if(hmap.size() > k){
                int val = hmap.get(s.charAt(prevPtr));
                hmap.put(s.charAt(prevPtr), hmap.get(s.charAt(prevPtr))-1);
                if(val == 1){
                    hmap.remove(s.charAt(prevPtr));
                }
                prevPtr++;
            }
            if(hmap.size()<=k){
                length = Math.max(length, i-prevPtr+1);
            }
        }
        return length;
    }
}
