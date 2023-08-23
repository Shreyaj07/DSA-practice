package CodingNinjas;
import java.util.Scanner;
class Solution {
    static void printSubstrings(String str) {
        int n = str.length();
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
    }
}
