//Day 5: Reverse Linkedin List
//206: Leetcode

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
    ListNode(){};
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
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println("null");
    }
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = dummy;
            dummy = head;
            head = temp;
        }
        return dummy;
    }
}