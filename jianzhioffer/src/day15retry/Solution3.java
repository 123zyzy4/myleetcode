package day15retry;

import org.junit.jupiter.api.Test;

public class Solution3 {
    int res;
    int k;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        inOrder(root);
        return res;
    }

    private void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.right);
        if(--k==0){
            res=root.val;
        }

        inOrder(root.left);
    }
    @Test
    public void test(){
        System.out.println(res);
    }


}
