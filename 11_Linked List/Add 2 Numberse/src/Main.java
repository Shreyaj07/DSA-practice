public class Main {
    public static void main(String[] args) {
        int[] list1 = {9,9,9,9,9,9,9};
        int[] list2 = {9,9,9,9};
        Solution solution = new Solution();
        ListNode l1 = solution.createList(list1);
        System.out.println("First list");
        solution.display(l1);
        ListNode l2 = solution.createList(list2);
        System.out.println("Second list");
        solution.display(l2);
        ListNode ans = solution.addTwoNumbers(l1,l2);
        System.out.println("Adding 2 lists");
        solution.display(ans);
    }
}