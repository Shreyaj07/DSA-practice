import java.util.* ;
import java.io.*;
class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i =0; i<k; i++){
            rotateLeft(arr);
        }
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotateLeft(int[] arr){
        if(arr.length==1 || arr.length==0){
            return;
        }
        if(arr.length==2){
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        int n = arr[0];
        for(int i =0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = n;
    }
}