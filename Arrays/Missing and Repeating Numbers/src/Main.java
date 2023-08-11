//Day2: Coding ninjas: q5

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     ArrayList<Integer> al = new ArrayList<>(Arrays.asList(6,4,3,5,5,1));
     int[] ans = Solution.missingAndRepeating(al,6);
        System.out.println(Arrays.toString(ans));
    }
}