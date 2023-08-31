public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        head.child = node1;
        node1.child = node2;
        Node secondHead = new Node(4);
        head.next = secondHead;
        Node node12 = new Node(5);
        Node node22 = new Node(6);
        secondHead.child = node12;
        node12.child = node22;
        Node thirdHead = new Node(7);
        secondHead.next = thirdHead;
        Node node31 = new Node(8);
        thirdHead.child = node31;
        Node fourthHead = new Node(9);
        thirdHead.next = fourthHead;
        fourthHead.child = new Node(12);
        fourthHead.next = new Node(20);
        Node ans = Solution.flattenLinkedList(head);
        Solution.display(ans);
    }
}