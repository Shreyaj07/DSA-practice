import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(3));
        System.out.println(isPowerOfThree(81));
        System.out.println(isPowerOfThree(32));
    }
    public static int isPowerOfThree(int n){
       int num = 1;
       if(n==1){
           return 1;
       }
       while(num < n){
           num = num*3;
           if(num==n){
               return 1;
           }
       }
       return 0;
    }
}