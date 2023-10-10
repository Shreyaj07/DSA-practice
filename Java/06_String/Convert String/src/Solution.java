/* convert string - Coding ninjas
 * You are given a string str. You have to convert the first alphabet of each word in a string to upper case
 */

public class Solution{
    public static String convertString(String str) {
        String[] s = str.split(" ");
        String ans="";
        for(int i =0; i<s.length; i++){
            String temp = s[i];
            String u = temp.substring(0,1).toUpperCase();
            s[i] = u+temp.substring(1);
            ans+=s[i]+" ";
        }
        return ans;
    }

}