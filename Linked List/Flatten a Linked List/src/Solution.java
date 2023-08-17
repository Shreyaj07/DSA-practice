class Node {
    public int data;
    public Node next;
    public Node child;

    Node() {
        this.data = 0;
        this.next = null;
        this.child = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.child = null;
    }

    Node(int data, Node next, Node child) {
        this.data = data;
        this.next = next;
        this.child = child;
    }
}

public class Solution {
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head = head.child;
    }
        System.out.println("null");
    }
    public static Node flattenLinkedList(Node root) {
        if(root==null | root.next==null){
            return root;
        }
        root.next = flattenLinkedList(root.next);
        root = merge2sortedLL(root, root.next);
        return root;
    }
    public static Node merge2sortedLL(Node l1, Node l2){
        Node temp = new Node(0);
        Node head = temp;
        while(l1!=null && l2!=null){
            if(l1.data < l2.data){
                temp.child = l1;
                l1 = l1.child;
            }else{
                temp.child = l2;
                l2 = l2.child;
            }
            temp = temp.child;
        }
        if(l1!=null){
            temp.child = l1;
        }
        if(l2!=null){
            temp.child = l2;
        }
        return head.child;
    }
}