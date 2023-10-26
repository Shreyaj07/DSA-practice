import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(List.of(4,2,2,2,3,4,4,3));
        System.out.println(smallestSubarrayWithKDistinct(al,3));
        System.out.println(smallestSubarrayWithKDistinct(al,33));
    }
    public static ArrayList<Integer> smallestSubarrayWithKDistinct(ArrayList<Integer> a, int K)
    {
        // Write your code here
        int sizei=-1;
        int sizej = -1;
        int size=0;
        for(int i=0; i<a.size(); i++){
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int j=i+1; j<a.size(); j++){
                hm.put(a.get(j), hm.getOrDefault(a.get(j),0)+1);
                if(hm.size()==K && j-i+1 >size){
                    sizei = i;
                    sizej = j;
                    size = j-i+1;
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        if(size>0){
            al.add(sizei);
            al.add(sizej);
        }else{
            al.add(-1);
        }
        return al;
    }
}