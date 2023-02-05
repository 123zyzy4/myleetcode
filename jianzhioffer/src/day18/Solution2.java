package day18;

public class Solution2 {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Math.abs(maxDepth(root.left)-maxDepth(root.right))>=2){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    private int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
//        if(root.left==null&&root.right==null){
//            return 1;
//        }
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }

}
