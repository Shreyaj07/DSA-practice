//https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return solve(root);
    }
    public static List<Integer> solve(TreeNode root){
        List<Integer> al = new ArrayList<>();
        if(root==null){
            return al;
        }
        al.addAll(solve(root.left));
        al.add(root.val);
        al.addAll(solve(root.right));
        return al;
    }
}