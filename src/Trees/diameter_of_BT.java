package Trees;

public class diameter_of_BT {
    public static int call(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }
        int l = call(root.left, max);
        int r = call(root.right, max);
        max[0] = Math.max(max[0], r + l);
        return 1 + Math.max(l, r);
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1];
        call(root, max);
        return max[0];
    }

    public static void main(String[] args) {
        // Create a sample tree: [1,2,3,4,5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int diameter =diameterOfBinaryTree(root);
        System.out.println("The diameter of the binary tree is: " + diameter);
    }
}
