public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(strs));
        String[] strs1 = {"dog","racecar","car"};
        System.out.println(solution.longestCommonPrefix(strs1));
        System.out.println(solution.longestCommonPrefix(new String[]{"a","ab"}));
    }
}