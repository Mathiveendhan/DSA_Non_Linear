package Trees;

public class maximum_path_sum {
    public static int maxPathSum(TreeNode root) {
        int[] max=new int[1];
        max[0] = Integer.MIN_VALUE;
        call(root,max);
        return max[0];
    }
    public static int call(TreeNode root,int[] max){
        if(root==null){
            return 0;
        }
        int l=Math.max(0,call(root.left,max));
        int r=Math.max(0,call(root.right,max));
        max[0]=Math.max(max[0],l+r+root.val);
        return Math.max(l,r)+root.val;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int result = maxPathSum(root);
        System.out.println("Maximum Path Sum: " + result);
    }
}
