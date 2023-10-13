import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(List.of(1,2,3,4,5,6));
        reverseArray(al,0);
        System.out.println(al);
    }
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        int n = arr.size();
        for(int i=m+1; i<(m+n+1)/2; i++){
            int temp = arr.get(i);
            arr.set(i, arr.get(n-i+m));
            arr.set(n-i+m, temp);
        }
    }
}
