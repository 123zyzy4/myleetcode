package day6retry;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<>();
        ArrayList<List<Integer>> list=new ArrayList<>();
        if(root!=null){
            queue.addLast(root);
        }
        int count=1;
        while(!queue.isEmpty()){
            LinkedList<Integer> perlevel=new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.removeFirst();
                if(count%2==0){
                    perlevel.addFirst(treeNode.val);
                }else {
                    perlevel.addLast(treeNode.val);
                }
                if(treeNode.left!=null){
                    queue.addLast(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.addLast(treeNode.right);
                }
            }
            list.add(perlevel);
            count++;

        }

        return list;
    }
}
