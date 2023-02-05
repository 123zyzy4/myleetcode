package day6retry;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution1 {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        LinkedList<TreeNode> queue=new LinkedList<>();
        ArrayList<TreeNode> list=new ArrayList<>();
        queue.addLast(root);
        while(!queue.isEmpty()){

            TreeNode treeNode = queue.removeFirst();
            list.add(treeNode);
            if(treeNode.left!=null){
                queue.addLast(treeNode.left);
            }
            if(treeNode.right!=null){
                queue.addLast(treeNode.right);
            }
        }
        int[] res=new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=list.get(i).val;
        }
        return res;

    }
}
