import java.util.HashMap;

public class Solution {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }

        HashMap<Character, Character> mapping1to2 = new HashMap<>();
        HashMap<Character, Character> mapping2to1 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // Check mapping from str1 to str2
            if (mapping1to2.containsKey(char1)) {
                if (mapping1to2.get(char1) != char2) {
                    return false; 
            // A different character in str2 is already mapped from str1.
                }
            } else {
                mapping1to2.put(char1, char2);
            }

            // Check mapping from str2 to str1
            if (mapping2to1.containsKey(char2)) {
                if (mapping2to1.get(char2) != char1) {
                    return false;
            // A different character in str1 is already mapped from str2.
                }
            } else {
                mapping2to1.put(char2, char1);
            }
        }

        return true;
    }
}
