public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.populate(new int[]{15,2,7,1,6,9,8,3,10});
        bst.display();
        System.out.println("Preorder");
        bst.preOrder();
        System.out.println("Inorder");
        bst.inOrder();
        System.out.println("Postorder");
        bst.postOrder();
    }
}
