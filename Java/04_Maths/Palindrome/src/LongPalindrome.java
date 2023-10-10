import java.util.* ;
import java.io.*;
public class LongPalindrome{
    public static void main(String[] args) {
        System.out.println(checkPalindrome(7));
        System.out.println(checkPalindrome(3));
        System.out.println(checkPalindrome(6));
    }

    public static boolean checkPalindrome(long N) {
        String binary = Long.toBinaryString(N);
        int n = binary.length();
        for(int i=0; i<(binary.length()+1)/2; i++){
            if(binary.charAt(i)!=binary.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

}