package day20retry;


import java.util.HashMap;
import java.util.HashSet;

public class Solution1 {
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return build(preorder,0,preorder.length-1,0);
    }
    //root_index记得要传进去
    private TreeNode build(int[] preorder,int left,int right,int root_index){
        if(left>right){
            return null;
        }
        int division=map.get(preorder[root_index]);
        TreeNode root=new TreeNode(preorder[root_index]);
        root.left=build(preorder, left, division-1,root_index+1);
        root.right=build(preorder, division+1, right,root_index+1+division-left);
        return root;
    }
}
