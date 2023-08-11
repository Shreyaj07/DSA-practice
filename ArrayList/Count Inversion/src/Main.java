//Day 2: Coding ninjas: question 6

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] arr = {2,5,1,3,4};
        long ans = Solution.getInversions(arr,arr.length);
        System.out.println("No. of inversions for: "+ Arrays.toString(arr) +" is: "+ans);
    }
}