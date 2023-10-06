//https://www.codingninjas.com/studio/problems/find-duplicate-in-array_1112602?leftPanelTab=0
import java.io.*;
import java.util.* ;
import java.util.ArrayList;

public class Solution{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(List.of(1,1,2));
        System.out.println(findDuplicate(al, al.size()));
    }
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (Integer integer : arr) {
            int x = hm.getOrDefault(integer, 0) + 1;
            hm.put(integer, x);
            if (x > 1) {
                return integer;
            }
        }
        return -1;
    }
}
