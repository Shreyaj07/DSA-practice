import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        System.out.println(countOf3(103));
    }
  public static long countOf3(int x) {
      int count =0;
      for(int i=1; i<=x; i++){
        count += has3(i);
      }
      return count;
  }
  public static int has3(int n){
    int count = 0;
    int length = (int)Math.log10(n)+1;
    for(int i=0; i<length; i++){
      int rem = n%10;
      if(rem==3){
        count++;
      }
      n /= 10;
    }
    return count;
  }
}