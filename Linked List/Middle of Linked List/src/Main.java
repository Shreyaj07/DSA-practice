public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        Solution solution = new Solution();
        solution.display(head);
        ListNode middle = solution.middleNode(head);
        solution.display(middle);
        ListNode sixth = new ListNode(6);
        fifth.next = sixth;
        solution.display(head);
        ListNode newMiddle = solution.middleNode(head);
        solution.display(newMiddle);

    }
}