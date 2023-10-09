//https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        for(int i=0;i <s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                String temp = s.substring(i,j);
                if(hasUniqueCharacters(temp)){
                    length = Math.max(temp.length(), length);
                }
            }
        }
        return length;
    }
    public static boolean hasUniqueCharacters(String s){
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                return false;
            }
            hs.add(s.charAt(i));
        }
        return true;
    }
}
