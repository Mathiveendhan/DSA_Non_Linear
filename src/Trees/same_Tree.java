package Trees;

public class same_Tree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return  isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
        public static void main(String[] args) {
            TreeNode tree1 = new TreeNode(1);
            tree1.left = new TreeNode(2);
            tree1.right = new TreeNode(3);
            TreeNode tree2 = new TreeNode(1);
            tree2.left = new TreeNode(2);
            tree2.right = new TreeNode(3);

            System.out.println( isSameTree(tree1, tree2));
        }
}
