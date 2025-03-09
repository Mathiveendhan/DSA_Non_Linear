package Trees;
import java.util.*;

public class balance_BT {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean isBalanced(TreeNode root) {
        return call(root)!=-1;
    }
    public static int call(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=call(root.left);
        int r=call(root.right);
        if(Math.abs(l-r)>1){
            return -1;
        }
        if(l==-1 || r==-1){
            return -1;
        }
        return Math.max(l,r)+1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(isBalanced(root));
    }
}
