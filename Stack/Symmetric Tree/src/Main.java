public class Main {
    public static void main(String[] args) {
//        int[] root = {1,2,2,3,4,4,3};
        TreeNode first = new TreeNode(1);
        first.left = new TreeNode(2);
        first.right = new TreeNode(2);
        first.left.left = new TreeNode(3);
        first.left.right = new TreeNode(4);
        first.right.left = new TreeNode(4);
        first.right.right = new TreeNode(3);
        Solution solution = new Solution();
        System.out.println(solution.isSymmetric(first));
//        [1,2,2,null,3,null,3]
        TreeNode second = new TreeNode(1);
        second.left=new TreeNode(2);
        second.right=new TreeNode(2);
        second.left.right = new TreeNode(3);
        second.right.right = new TreeNode(3);
        System.out.println(solution.isSymmetric(second));
    }
}