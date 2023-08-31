import java.util.Arrays;
import java.util.HashSet;

public class RemoveVowels {
    public static void main(String[] args) {
        System.out.println(Solution.removeVowels("CodingNinjas"));
    }
    public class Solution {
        public static String removeVowels(String str) {
            StringBuilder consonants = new StringBuilder();
            HashSet<Character> hs = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
            for(int i =0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(!hs.contains(ch)){
                    consonants.append(ch);
                }
            }
            return consonants.toString();
        }
    }
}
