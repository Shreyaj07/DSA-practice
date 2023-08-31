
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        k = k % length;
        for (int i = 0; i < k; i++) {
            head = rotate(head);
        }
        return head;
    }

    public static ListNode rotate(ListNode head) {
        ListNode ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ListNode tail = ptr.next;
        ptr.next = null;
        tail.next = head;
        head = tail;
        return head;
    }
}