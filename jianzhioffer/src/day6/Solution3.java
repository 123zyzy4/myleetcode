package day6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution3 {
    public List<List<Integer>> levelOrder(TreeNode root) {


        LinkedList<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root!=null){
            queue.addLast(root);
        }
        int count=1;
        while(!queue.isEmpty()){
            LinkedList<Integer> perlevel=new LinkedList<>();
            int temp= queue.size();
            for (int i = 0; i < temp; i++) {
                TreeNode treeNode=queue.removeFirst();

                if (count % 2 == 0) {
                     perlevel.addFirst(treeNode.val);
                }else{
                    perlevel.addLast(treeNode.val);
                }

                if (treeNode.left != null) {
                    queue.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.addLast(treeNode.right);
                }


            }
            list.add(perlevel);
            count++;

        }
        return list;

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
        List<List<Integer>> result=levelOrder(t1);
    }
}
