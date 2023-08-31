import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void duplicateCharsInString(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character, Integer> map: hm.entrySet()){
            char key = map.getKey();
            int value = map.getValue();
            if(value >1){
                System.out.println(key+", count = "+value);
            }
        }
    }
}
