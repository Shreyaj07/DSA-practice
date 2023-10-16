import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Main {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        ArrayList<ArrayList<Long>> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            String t = String.valueOf(Math.pow(11,i));
            char[] arr = t.toCharArray();
            ArrayList<Long> temp = new ArrayList<>();
            for(int j=0; j<arr.length; j++){
                temp.add(Long.parseLong(String.valueOf(arr[i])));
            }

        }
        return al;
    }
}