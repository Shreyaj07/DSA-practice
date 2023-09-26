import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int length=0;
        int i =0;
       while(i<s.length()){
            if(hm.containsKey(s.charAt(i))){
                hm.clear();
            }
            hm.put(s.charAt(i),i);
            if(hm.size()>length){
                length = hm.size();
            }
        }
        return length;
    }
}