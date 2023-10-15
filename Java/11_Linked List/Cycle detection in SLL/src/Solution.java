//https://www.codingninjas.com/studio/problems/cycle-detection-in-a-singly-linked-list_628974?leftPanelTab=0

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/
import java.util.*;

public class Solution {

    public static boolean detectCycle(Node head) {
        //Your code goes here
        HashSet<Node> hs = new HashSet<>();
        while(head!=null){
            if(hs.contains(head)){
                return true;
            }
            hs.add(head);
            head = head.next;
        }
        return false;
    }
}