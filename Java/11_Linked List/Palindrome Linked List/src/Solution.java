import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode{
    int val;
    ListNode next;
    ListNode () {}
    ListNode (int val){
        this.val = val;
    }
    ListNode (int val, ListNode next){
        this.val = val;
        this.next  = next;
    }
}
class Solution {
    public static void display(ListNode head){
        while(head!=null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public ListNode acreateList(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i =1; i<arr.length; i++){
            head.next = new ListNode(arr[i]);
            head = head.next;
        }
        return temp;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        if(head==null || head.next==null){
            return true;
        }
        while(fastPtr!=null && fastPtr.next !=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        ListNode newHead = null;
        while(slowPtr!=null){
            ListNode temp = slowPtr.next;
            slowPtr.next = newHead;
            newHead = slowPtr;
            slowPtr = temp;
        }
        while(newHead!=null){
            if(head.val!=newHead.val){
                return false;
            }
            head = head.next;
           newHead = newHead.next;
        }

        return true;
    }
}