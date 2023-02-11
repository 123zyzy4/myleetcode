package day25;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Solution1 {
//    boolean[][] isvisited;
//    int[][] matrix;
//    public int[] spiralOrder(int[][] matrix) {
//        isvisited=new boolean[matrix.length][matrix[0].length];
//        this.matrix=matrix;
//        int[] res=new int[matrix.length*matrix[0].length];
//        int i=0,j=0;
//        int z=0;
//        while (true){
//            int temp=z;
//            while (canRight(i,j)){
//                res[z++]=matrix[i][j];
//                j++;
//            }
//            while (canDown(i,j)){
//                res[z++]=matrix[i][j];
//                i++;
//            }
//            while (canLeft(i,j)){
//                res[z++]=matrix[i][j];
//                j--;
//            }
//            while (canUp(i,j)){
//                res[z++]=matrix[i][j];
//                i--;
//            }
//            if(z==temp){
//                break;
//            }
//        }
//        return res;
//
//    }
//    private boolean canRight(int i,int j){
//        if(j<matrix[0].length-1&&isvisited[i][j+1]==false){
//            return true;
//        }
//        return false;
//    }
//    private boolean canDown(int i,int j){
//        if(i<matrix.length-1&&isvisited[i+1][j]==false){
//            return true;
//        }
//        return false;
//    }
//    private boolean canLeft(int i,int j){
//        if(j>0&&isvisited[i][j-1]==false){
//            return true;
//        }
//        return false;
//    }
//    private boolean canUp(int i,int j){
//        if(i>0&&isvisited[i-1][j]==false){
//            return true;
//        }
//        return false;
//    }
//    @Test
//    public void test(){
//        Solution1 test=new Solution1();
//        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
//        int[] res=test.spiralOrder(matrix);
//        System.out.println(res);
//    }

    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        int[] res=new int[matrix.length*matrix[0].length];
        int left=0,right=matrix[0].length-1,top=0,bottom= matrix.length-1;
        int z=0;
        while (true){
            for (int i = left; i <=right; i++) {
                res[z++]=matrix[top][i];
            }
            if(++top>bottom){
                break;
            }
            for (int i = top; i <= bottom; i++) {
                res[z++]=matrix[i][right];
            }
            if(--right<left){
                break;
            }
            for (int i = right; i >= left; i--) {
                res[z++]=matrix[bottom][i];
            }
            if(--bottom<top){
                break;
            }
            for (int i = bottom; i >= top; i--) {
                res[z++]=matrix[i][left];
            }
            if(++left>right){
                break;
            }
        }
        return res;
    }
}
