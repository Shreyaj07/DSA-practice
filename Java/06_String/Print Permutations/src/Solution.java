import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        System.out.println("xyz");
    }
    public static List<String> findPermutations(String s) {
        // Write your code here.
        return solve("",s);
    }
    public static List<String> solve(String p, String up){
        ArrayList<String> al = new ArrayList<>();
       if(up.isEmpty()){
           al.add(p);
           return al;
       }
       al.addAll(solve(p+up.charAt(0),up.substring(1)));
       al.addAll(solve(up.charAt(0)+p,up.substring(1)));
       return al;
    }
}