public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        Solution solution = new Solution();
        ListNode merge = solution.mergeTwoLists(list1,list2);
        while(merge!=null){
            System.out.print(merge.val + " -> ");
            merge = merge.next;
        }
        System.out.println("null");
    }
}