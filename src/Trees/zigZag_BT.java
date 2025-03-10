package Trees;
import java.util.*;

public class zigZag_BT {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            List<Integer> arr = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode r = q.poll();
                if (r.left != null) {
                    q.add(r.left);
                }
                if (r.right != null) {
                    q.add(r.right);
                }
                arr.add(r.val);
            }
            if (level % 2 != 0) {
                Collections.reverse(arr);
            }
            ans.add(arr);
            level++;
        }
        return ans;
    }
    public static void main(String[] args) {
        // Construct the tree for input: [3, 9, 20, null, null, 15, 7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = zigzagLevelOrder(root);

        // Print the result
        System.out.println(result);  // Expected Output: [[3], [20, 9], [15, 7]]
    }
}
