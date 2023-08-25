import com.sun.source.tree.Tree;

import java.util.*;

/************************************************************

 Following is the TreeNode class structure:

 class TreeNode {
 int data;
 TreeNode left;
 TreeNode right;
 TreeNode(int data) {
 this.data = data;
 this.left = null;
 this.right = null;
 }
 }
 ************************************************************/
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Solution {
    static void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode temp = root;
        while (temp != null) {
            temp = q.poll();
            if (temp == null) {
                break;
            }
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }
        System.out.println();
    }

    public static ArrayList<Integer> reverseLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        q.offer(root);
        TreeNode temp = root;
        while (temp != null) {
            temp = q.poll();
            if (temp == null) {
                break;
            }
            st.add(temp);
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }
        while (!st.isEmpty()) {
            al.add(st.pop().data);
        }
        return al;
    }
    public static List<Integer> traverseBoundary(TreeNode root){
        List<Integer> al = new ArrayList<>();
        HashSet<TreeNode> hs = new HashSet<>();

        //traversing through left side
        TreeNode temp = root;
        while(temp!=null){
            al.add(root.data);
            hs.add(root);
            temp = temp.left;
        }
        //traversing though right side
        temp = root;
        List<Integer> right = new ArrayList<>();
        return al;
    }
}





