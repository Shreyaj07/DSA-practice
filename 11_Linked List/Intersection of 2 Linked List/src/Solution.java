import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    ListNode() {}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptra = headA;
        ListNode ptrb = headB;
        HashSet<ListNode> hs = new HashSet<>();
        while(ptra!=null && ptrb!=null){
            if(hs.contains(ptra)){
                return ptra;
            }
            if(hs.contains(ptrb)){
                return ptrb;
            }
            if(ptra==ptrb){
                return ptra;
            }
            hs.add(ptra);
            hs.add(ptrb);
            ptra = ptra.next;
            ptrb = ptrb.next;
        }
        while(ptra!=null){
            if(hs.contains(ptra)){
                return ptra;
            }
            hs.add(ptra);
            ptra = ptra.next;
        }
        while(ptrb!=null){
            if(hs.contains(ptrb)){
                return ptrb;
            }
            hs.add(ptrb);
            ptrb = ptrb.next;
        }
        return null;
    }
}