public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(0);
        ListNode third = new ListNode(-4);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = first; //cycle
        Solution solution = new Solution();
        System.out.println(solution.detectCycle(head).val);
    }
}