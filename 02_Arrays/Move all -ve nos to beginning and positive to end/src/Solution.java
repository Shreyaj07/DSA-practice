import java.util.Arrays;
import java.util.Collections;
//https://www.codingninjas.com/studio/problems/move-all-negative-numbers-to-beginning-and-positive-to-end_1112620?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar&count=25&page=1&search=&sort_entity=order&sort_order=ASC
public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,-4,-2,5,3};
        System.out.println(Arrays.toString(separateNegativeAndPositive(arr)));
    }
    public static int[] separateNegativeAndPositive(int[] a) {
       Arrays.sort(a);
       int[] arr = new int[a.length];
       int length = a.length-1;
       for(int i=0; i<a.length; i++){
           arr[i] = a[length];
           length--;
       }
       return a;
    }
}