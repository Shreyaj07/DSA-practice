import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        return solve(root);
    }
    public static List<Integer> solve(TreeNode root){
        List<Integer> al = new ArrayList<>();
        if(root==null){
            return al;
        }
        al.addAll(solve(root.left));
        al.addAll(solve(root.right));
        al.add(root.val);
        return al;
    }
}