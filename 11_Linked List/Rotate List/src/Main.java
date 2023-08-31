public class Main {
    public static void main(String[] args) {
        ListNode fifth = new ListNode(5);
        ListNode fourth = new ListNode(4,fifth);
        ListNode third = new ListNode(3,fourth);
        ListNode second = new ListNode(2,third);
        ListNode first = new ListNode(1,second);
        int rotateRightTimes = 2000;
        ListNode head = Solution.rotateRight(first, rotateRightTimes);
        while(head!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println("null");
    }
}