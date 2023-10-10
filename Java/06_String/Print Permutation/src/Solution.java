import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println("abc");
    }

    public static List<String> findPermutations(String s) {
        List<String> permutation = new ArrayList<>();
        solve("", s, permutation);
        return permutation;
    }

    private static void solve(String p, String up, List<String> permutation) {
        int n = up.length();
        if (n == 0) {
            permutation.add(p);
        } else {
            for (int i = 0; i < n; i++) {
                solve(p + up.charAt(i), up.substring(0, i) + up.substring(i + 1, n), permutation);
            }
        }
    }

}