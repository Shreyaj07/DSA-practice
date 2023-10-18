import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxPerimeterTriangle(new ArrayList<>(Arrays.asList(3,7,1,5)),4));
    }
    public static int maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int maxPerimeter = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if((arr.get(i)+arr.get(j) > arr.get(k)) || (arr.get(i)+arr.get(k) > arr.get(j)) || (arr.get(j)+arr.get(k) > arr.get(i))){
                        int peri = arr.get(i) + arr.get(j) + arr.get(k);
                        if(getArea(arr.get(i), arr.get(j), arr.get(k)) > 0){
                        maxPerimeter = Math.max(peri, maxPerimeter);
                        }
                    }
                }
            }
        }
        return maxPerimeter;
    }
    public static double getArea(int a, int b, int c){
        double s = (double) (a + b + c) /2;
        return Math.sqrt(s * (s-a)*(s-b)*(s-c));
    }
}