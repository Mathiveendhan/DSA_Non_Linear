package Trees;
import java.util.*;

public class level_order_traversal {

        public static List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            List<List<Integer>> ans = new LinkedList<>();

            if (root == null) {
                return ans;
            }

            q.add(root);

            while (!q.isEmpty()) {
                int n = q.size();
                List<Integer> arr = new LinkedList<>();

                for (int i = 0; i < n; i++) {
                    TreeNode node = q.poll();
                    arr.add(node.val);

                    if (node.left != null) {
                        q.add(node.left);
                    }

                    if (node.right != null) {
                        q.add(node.right);
                    }
                }

                ans.add(arr);
            }

            return ans;
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20);
            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(7);
            List<List<Integer>> result = levelOrder(root);

            System.out.println(result);
        }
}
