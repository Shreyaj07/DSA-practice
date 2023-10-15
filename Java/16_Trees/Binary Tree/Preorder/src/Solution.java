//https://www.codingninjas.com/studio/problems/preorder-traversal_3838888?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1

import java.util.* ;
import java.io.*;


public class Solution {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		return solve(root);
    }
	  public static List<Integer> solve(TreeNode root){
        List<Integer> al = new ArrayList<>();
        if(root==null){
            return al;
        }
		al.add(root.data);
        al.addAll(solve(root.left));
        al.addAll(solve(root.right));
        return al;
    }
}