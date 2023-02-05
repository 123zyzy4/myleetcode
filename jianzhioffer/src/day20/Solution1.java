package day20;

import sun.reflect.generics.tree.Tree;

import javax.transaction.TransactionRequiredException;
import java.util.HashMap;
import java.util.HashSet;

public class Solution1 {
    int[] preorder;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        for (int i = 0; i < preorder.length; i++) {
            map.put(inorder[i],i);
        }
        return build(0,0, preorder.length-1);

    }
    //root_index是前序遍历数组中root对应的下标
    private TreeNode build(int root_index,int left,int right){
        if(left>right){
            return null;
        }
        TreeNode root = new TreeNode(preorder[root_index]);
        int division=map.get(preorder[root_index]);
        root.left=build(root_index+1,left,division-1);
        root.right=build(root_index+division-left + 1,division+1,right);
        return root;
    }
}
