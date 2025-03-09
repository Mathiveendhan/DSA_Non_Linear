package Trees;

import java.util.List;

public class Max_Depth_BT {
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+Math.max(l,r);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxDepth(root));

    }
}
