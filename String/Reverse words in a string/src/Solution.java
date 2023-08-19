class Solution {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split("\\s+");
        String rev = "";
        for(int i =str.length-1; i>=0; i--){
            rev+=str[i].trim() + " ";
        }
        rev = rev.trim();
        return rev;
    }
}
