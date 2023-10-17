import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> printReverse(int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int num = 1;
        for(int i=1; i<=n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=1; j<=i;j++){
                temp.add(num);
                num = num + 1;
            }
            if(i%2!=1){
                Collections.sort(temp, Collections.reverseOrder());
            }
            al.add(temp);
        }
        return al;
    }
}