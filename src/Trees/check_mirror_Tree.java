package Trees;

public class check_mirror_Tree {
    public static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return same(root.left,root.right);
    }
    public static boolean same(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return same(p.left,q.right) && same(p.right,q.left);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        boolean result =isSymmetric(root);
        System.out.println( result);
    }
}
