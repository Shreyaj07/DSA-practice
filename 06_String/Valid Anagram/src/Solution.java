import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] firstString = s.toCharArray();
        Arrays.sort(firstString);
        char[] secondString = t.toCharArray();
        Arrays.sort(secondString);
        System.out.println(firstString);
        System.out.println(secondString);
        return Arrays.toString(firstString).equals(Arrays.toString(secondString));
    }
}