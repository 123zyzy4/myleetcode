package day25retry;

public class Solution1 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return new int[0];
        }
        int left=0,right=matrix[0].length-1;
        int top=0,bottom= matrix.length-1;
        int[] res=new int[matrix[0].length* matrix.length];
        int k=0;
        while (true){
            for (int i = left; i <= right; ++i) {
                res[k++]= matrix[top][i];
            }
            top++;
            if(top>bottom){
                return res;
            }
            for (int i = top; i <= bottom; ++i) {
                res[k++]= matrix[i][right];
            }
            right--;
            if(left>right){
                return res;
            }
            for (int i = right; i >=left; --i) {
                res[k++]= matrix[bottom][i];
            }
            bottom--;
            if(top>bottom){
                return res;
            }
            for (int i = bottom; i >= top; --i) {
                res[k++]= matrix[i][left];
            }
            left++;
            if(left>right){
                return res;
            }
        }
    }
}
