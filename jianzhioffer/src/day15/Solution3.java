package day15;

public class Solution3 {
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        inOrder(root);
        return res;
    }

    private void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.right);
        if(k==1){
            res=root.val;
        }
        k--;

        inOrder(root.left);
    }









//看成第k小的了
//    public int kthLargest(TreeNode root, int k) {
//        int num=sum(root.left);
//        if(num==k+1){
//            return root.val;
//        }else if(num<=k){
//            return kthLargest(root.right,k-num-1);
//        }else{
//            return kthLargest(root.left,k);
//        }
//    }
//    private int sum(TreeNode root){
//        if(root==null){
//            return 0;
//        }
//        return 1+sum(root.left)+sum(root.right);
//    }
}
