package day6retry;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        LinkedList<TreeNode> queue=new LinkedList<>();
        ArrayList<List<Integer>> list=new ArrayList<>();
        if(root!=null){
            queue.addLast(root);
        }
        while(!queue.isEmpty()){
            List<Integer> perlevel=new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.removeFirst();
                perlevel.add(treeNode.val);
                if(treeNode.left!=null){
                    queue.addLast(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.addLast(treeNode.right);
                }
            }
            list.add(perlevel);

        }

        return list;

    }
}
