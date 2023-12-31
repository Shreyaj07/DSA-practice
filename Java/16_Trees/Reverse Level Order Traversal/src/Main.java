import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left=new TreeNode(8);
        Solution.levelOrderTraversal(root);
        System.out.println(Solution.reverseLevelOrder(root).toString());
        System.out.println();
        System.out.println(Solution.traverseBoundary(root).toString());
    }
}