package day6;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        LinkedList<TreeNode> queue=new LinkedList<>();
        LinkedList<TreeNode> list=new LinkedList<>();
        queue.addLast(root);
        while(!queue.isEmpty()){
            TreeNode treeNode=queue.removeFirst();
            list.add(treeNode);
            if (treeNode.left != null) {
                queue.addLast(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.addLast(treeNode.right);
            }

        }
        int[] result=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i]=list.get(i).val;
        }
        return result;

    }
    @Test
    public void test(){
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        t1.left=t2;
        t1.right=t3;
        t2.left=null;
        t2.right=null;
        t3.left=t4;
        t3.right=null;
        t4.left=null;
        t4.right=null;
        int[] result=levelOrder(t1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
