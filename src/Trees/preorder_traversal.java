package Trees;
import java.util.*;

public class preorder_traversal {



    // NO recursion approach

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null){
            return ans;
        }
        st.push(root);
        while(!st.isEmpty()){
            TreeNode r=st.pop();
            ans.add(r.val);
            if(r.left!=null){
                st.push(r.left);
            }
            if(r.right!=null) {
                st.push(r.right);
            }
        }
        return ans;
    }


//        public List<Integer> preorderTraversal(TreeNode root) {
//            List<Integer> result = new ArrayList<>();
//            preorderHelper(root, result);
//            return result;
//        }
//
//        private void preorderHelper(TreeNode root, List<Integer> result) {
//            if (root == null) {
//                return;
//            }
//            result.add(root.val);
//            preorderHelper(root.left, result);
//            preorderHelper(root.right, result);
//        }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        preorder_traversal tree = new preorder_traversal();
        List<Integer> result = tree.preorderTraversal(root);
        System.out.println("Preorder Traversal: " + result);
    }
    }
