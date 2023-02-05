package day15retry;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {

    LinkedList<Integer> path=new LinkedList<>();
    LinkedList<List<Integer>> res=new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        preOrder(root, target);
        return res;
    }

    private void preOrder(TreeNode root, int target){
        if(root==null){
            return;
        }
        path.add(root.val);
        target-= root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(new LinkedList<>(path));
        }
        preOrder(root.left, target);
        preOrder(root.right, target);
        path.removeLast();
    }
}
