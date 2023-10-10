import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findAllSelfDividingNumbers(1,22));
        System.out.println(findAllSelfDividingNumbers(100,150));
    }
    public static ArrayList<Integer> findAllSelfDividingNumbers(int lower, int upper) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=lower; i<=upper; i++){
            if(isSelfDividing(i)){
                al.add(i);
            }
        }
        return al;
    }
    public static boolean isSelfDividing(int n){
        int numberOfDigits = (int)(Math.log10(n))+1; //nos
        int number = n;
        for(int i=0; i<numberOfDigits; i++){
            int dig = n%10;
            if(dig==0){
                return false;
            }
            if(number%dig!=0){
                return false;
            }
            n = n/10;
        }
        return true;
    }
}