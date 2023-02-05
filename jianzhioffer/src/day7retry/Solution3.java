package day7retry;

public class Solution3 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric_(root.left, root.right);
    }
    private boolean isSymmetric_(TreeNode root1,TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSymmetric_(root1.left, root2.right) && isSymmetric_(root1.right, root2.left);
    }
}
