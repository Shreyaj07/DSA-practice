public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(solution.longestConsecutive(arr));
        System.out.println(solution.longestConsecutive(new int[]{1,0,1,2}));
    }
}