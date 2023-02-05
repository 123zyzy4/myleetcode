package day7;

public class Solution1 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B==null||A==null){
            return false;
        }

        if(A.val!=B.val){
            return isSubStructure(A.left,B)||isSubStructure(A.right,B);
        }else{
            return isSubTree(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
        }
    }
    private boolean isSubTree(TreeNode A, TreeNode B){
        if(B==null){
            return true;
        }
        if(A==null){
            return false;
        }
        if(A.val== B.val){
            return isSubTree(A.left,B.left)&&isSubTree(A.right,B.right);
        }else{
            return false;
        }
    }
}
