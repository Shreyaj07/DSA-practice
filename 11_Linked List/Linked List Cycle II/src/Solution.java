import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class ListNode{
    int val;
    ListNode next;
    ListNode() {};
    ListNode (int val){
        this.val = val;
    }
    ListNode (int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hs= new HashSet<>();
        while(head!=null){
            if(hs.contains(head)){
                return head;
            }
            hs.add(head);
            head = head.next;
        }
        return null;
    }
}