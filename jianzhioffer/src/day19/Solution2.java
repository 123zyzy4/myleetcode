package day19;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        LinkedList<TreeNode> list1=new LinkedList<>() ;
//        LinkedList<TreeNode> list2=new LinkedList<>() ;
//        findFather(root,p,list1);
//        findFather(root,q,list2);
//        int i=0;
//        while(i< list1.size()&&i< list2.size()){
//            if(list1.get(i)==list2.get(i)){
//                i++;
//            }else {
//                break;
//            }
//        }
//        return list1.get(i-1);
        while(root != null) {
            if(root.val < p.val && root.val < q.val)
                root = root.right;
            else if(root.val > p.val && root.val > q.val)
                root = root.left;
            else break;
        }
        return root;



    }
//    private LinkedList<TreeNode> findFather(TreeNode root,TreeNode p){
//        if(root==null){
//            return null;
//        }
//        LinkedList<TreeNode> list=new LinkedList<>();
//        list.addLast(root);
//        while(!list.isEmpty()){
//            TreeNode temp=list.removeLast();
//            if(temp==p){
//                break;
//            }
//        }
//        if(root==p){
//            list.addLast(root);
//            return;
//        }
//        list.addLast(root);
//        findFather(root.left,p,list);
//        findFather(root.right,p,list);
//        list.removeLast();
//
//    }
    @Test
    public void test(){
        TreeNode t1 = new TreeNode(6);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(0);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(7,null,null);
        TreeNode t7 = new TreeNode(9,null,null);
        TreeNode t8 = new TreeNode(3,null,null);
        TreeNode t9 = new TreeNode(5,null,null);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        t3.left=t6;
        t3.right=t7;
        t4.left=null;
        t4.right=null;
        t5.left=t8;
        t5.right=t9;
        LinkedList<TreeNode> list1=new LinkedList<>() ;
        LinkedList<TreeNode> list2=new LinkedList<>() ;
        //findFather(t1,t2,list1);
        //findFather(t1,t5,list2);
        System.out.println("ok");

    }
}
