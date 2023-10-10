public class Main {
    public static void main(String[] args) {
        ListNode fifth = new ListNode(5);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(8);
        ListNode second_a = new ListNode(1,third);
        ListNode third_b = new ListNode(1, third);
        ListNode headA = new ListNode(4,second_a);
        ListNode second_b = new ListNode(6, third_b);
        ListNode headB = new ListNode(5, second_b);
        Solution solution = new Solution();
        System.out.println(solution.getIntersectionNode(headA, headB).val);
    }
}