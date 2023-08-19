import java.util.Arrays;
//Brute force soln
//Day 7: 42: Leetcode: Trapping rainwater
public class Main {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(height));
        System.out.println(solution.trap(height));
        int[] height2 = {4,2,0,3,2,5};
        System.out.println(Arrays.toString(height2));
        System.out.println(solution.trap(height2));
    }
}