import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Solution solution = new Solution();
    long[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125};
    ArrayList<Long> ans = solution.find(arr,9,5);
        System.out.println(ans.toString());
    }
}