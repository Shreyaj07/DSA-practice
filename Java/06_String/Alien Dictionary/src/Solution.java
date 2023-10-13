import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"word","world","hello"};
        String order = "worldabcdefghijklmnopqrstuvwxyz";
        System.out.println(alienDictonary(n ,words, order));
    }
    public static boolean alienDictonary(int n, String words[], String order) {
     HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            hm.put(order.charAt(i), i);
        }
        for (int i = 0; i < n - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];
            int len1 = w1.length();
            int len2 = w2.length();
            int minLength = Math.min(len1, len2);
            for (int j = 0; j < minLength; j++) {
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);
                if (c1 != c2) {
                    int place1 = hm.get(c1);
                    int place2 = hm.get(c2);
                    if (place1 > place2) {
                        return false; // The order is not correct
                    }
                    // If the characters at this position are in the correct order, move on to the next pair of characters.
                    break;
                }
                // If both words have the same characters up to this point, continue to the next characters.
            }
            // If w2 is a prefix of w1 and w2 is longer, it's not in the correct order.
            if (len1 > len2 && w1.startsWith(w2)) {
                return false;
            }
        }
        return true;
    }

}