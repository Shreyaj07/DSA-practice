import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        int l = arr[0][0];
        int r = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            int left = arr[i][0];
            int right = arr[i][1];
            if (left >= l && left <= r) {
                r = Math.max(r, right);
            } else {
                al.add(new ArrayList<>(Arrays.asList(l, r)));
                l = left;
                r = right;
            }
        }
        al.add(new ArrayList<>(Arrays.asList(l, r)));
        return al;
    }
}