package day7;

public class Solution2 {
    public TreeNode mirrorTree(TreeNode root) {
        swap(root);
        return root;
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
}
