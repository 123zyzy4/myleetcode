package day7;

public class Solution3 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSame(root.left,root.right);
    }
    private void swap(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        swap(root.left);
        swap(root.right);
    }
    private boolean isSame(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        if(root1.val== root2.val){
            return isSame(root1.left,root2.right)&&isSame(root1.right,root2.left);
        }else{
            return false;
        }

    }
}
