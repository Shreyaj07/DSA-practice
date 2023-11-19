import java.util.* ;
import java.io.*; 
public class Solution {
    public static int maximumSwap(int n){
        // Write your code here.
       char[] digits = Integer.toString(n).toCharArray();
        int size = digits.length;

        // Create an array to store the last occurrence of each digit in the number
        int[] lastOccurrence = new int[10];
        for (int i = 0; i < size; i++) {
            lastOccurrence[digits[i] - '0'] = i;
        }

        // Iterate through the digits to find the best pair to swap
        for (int i = 0; i < size - 1; i++) {
            for (int d = 9; d > digits[i] - '0'; d--) {
                // Check if there's a larger digit occurring later in the number
                if (lastOccurrence[d] > i) {
                    // Swap the digits
                    char temp = digits[i];
                    digits[i] = digits[lastOccurrence[d]];
                    digits[lastOccurrence[d]] = temp;

                    // Convert the char array back to an integer
                    return Integer.parseInt(new String(digits));
                }
            }
        }

        // If no swap is needed, the number is already the maximum
        return n;

    }
}