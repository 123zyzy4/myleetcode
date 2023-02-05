package day5;

public class Solution1 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; ) {
            int low=0,high=matrix[i].length-1;
            int mid;
            while(low<=high){
                mid=(low+high)/2;
                if(target>=matrix[i][mid]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            if(high<0||matrix[i][high]!=target){
                i++;
            }else{
             return true;
            }
        }
        return false;
    }
}
