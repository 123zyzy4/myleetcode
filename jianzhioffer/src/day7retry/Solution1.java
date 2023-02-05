package day7retry;

public class Solution1 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B==null||A==null){
            return false;
        }
        if(A.val==B.val){
            return isSub(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
        }else {
            return isSubStructure(A.left,B)||isSubStructure(A.right,B);
        }
    }
    private boolean isSub(TreeNode A, TreeNode B){
        if(B==null){
            return true;
        }
        if(A==null){
            return false;
        }
        if(A.val!=B.val){
            return false;
        }
        return isSub(A.left,B.left)&&isSub(A.right,B.right);
    }
}
