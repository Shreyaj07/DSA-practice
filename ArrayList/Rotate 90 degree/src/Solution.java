import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
       for(int col=0; col<m; col++){
           ArrayList<Integer> temp = new ArrayList<>();
           for(int row=n-1; row>=0; row--){
               temp.add(mat.get(row).get(col));
           }
           al.add(temp);
       }
        mat.clear();
        mat.addAll(al);
        for(ArrayList<Integer> a: al){
            System.out.println(a.toString());
        }
    }
}
