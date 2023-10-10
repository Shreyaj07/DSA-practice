class ListNode {
    ListNode next;
    int val;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode createList(int[] list) {
        ListNode temp = new ListNode();
        ListNode dummy= temp;
        for (int i = 0; i < list.length; i++) {
            ListNode node = new ListNode(list[i]);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }

    public void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode();
        ListNode dummy = newList;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int value = l1.val + l2.val + carry;
            carry = value / 10;
            value = value % 10;
            ListNode node = new ListNode(value);
            newList.next = node;
            newList = newList.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int value = l1.val + carry;
            carry = value / 10;
            value = value % 10;
            ListNode node = new ListNode(value);
            newList.next = node;
            newList = newList.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int value = l2.val + carry;
            carry = value / 10;
            value = value % 10;
            ListNode node = new ListNode(value);
            newList.next = node;
            l2 = l2.next;
            newList = newList.next;
        }
        if (carry != 0) {
            ListNode node = new ListNode(carry);
            newList.next = node;
        }
        return dummy.next;
    }

}
