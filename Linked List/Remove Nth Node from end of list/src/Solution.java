//Leetcode 19: Day 5

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
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public void display(ListNode head){
        while(head!=null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for(int i =1; i<=n+1; i++){
            first = first.next;
        }
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        if(second.next!=null){
            second.next = second.next.next;
        }
        return dummy.next;
    }
}