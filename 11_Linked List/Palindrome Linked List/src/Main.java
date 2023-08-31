public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = solution.acreateList(new int[]{1,2,2,1});
        Solution.display(head);
        System.out.println(solution.isPalindrome(head));
        solution.isPalindrome(head);
        ListNode head2 = solution.acreateList(new int[]{1,1,2,1});
        System.out.println(solution.isPalindrome(head2));
    }
}