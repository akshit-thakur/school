import java.util.Scanner;

class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode() {
        data = 0;
        left = right = null;
    }

    public TreeNode(int n) {
        data = n;
        left = right = null;
    }

    public void disp() {
        System.out.print(data + " ");
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setData(int d) {
        data = d;
    }

    public int getData() {
        return data;
    }

    /** inserting items code segereated */
    public void setLeft(TreeNode n) {
        left = n;
    }

    public void setRight(TreeNode n) {
        right = n;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(TreeNode r) {
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    public boolean search(java.lang.String value) {
        return search(root, value);
    }

    private boolean search(TreeNode r, java.lang.String v) { /** recursion */
        int val = Integer.parseInt(v);
        boolean found = false;
        while ((r != null) && !found) {
            int rVal = r.getData();
            if (val < rVal)
                r = r.getLeft();
            else if (val > rVal)
                r = r.getRight();
            else {
                found = true;
                break;
            }
            found = search(r, java.lang.String.valueOf(val));
        }
        return found;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(TreeNode r) { /** recursion */
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(TreeNode r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(TreeNode r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }

    /** inserting code segregated */
    public void insert(int data) {
        root = insert(root, data);
    }

    private TreeNode insert(TreeNode node, int data) {
        if (node == null)
            node = new TreeNode(data);
        else {
            if (data <= node.data)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return (node); // in any case,return new reference to the caller
    }

    public boolean isEmpty() {
        return root == null;
    }
}

public class BinaryTreeTraversal {
    protected static BinaryTree bt;

    public static void main(String args[]) {
        bt = new BinaryTree(); // tree created here
        Scanner read = new Scanner(System.in);
        int val;
        do {
            System.out.print("Enter a number,enter 0 to exit: ");
            val = read.nextInt();
            if (val != 0)
                bt.insert(val);
        } while (val != 0);
        System.out.println("\nPostorder traversal of given tree is: ");
        bt.postorder();
        System.out.println("\nPreorder traversal of given tree is: ");
        bt.preorder();
        System.out.println("\nInorder traversal of given tree is: ");
        bt.inorder();
        int l = bt.countNodes();
        System.out.println("\nNumber of nodes in given tree is: " + l);
        System.out.println();
        read.close();
    }
}