package day24;

import java.util.ArrayList;

public class Solution1 {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> list=new ArrayList<>();
        int left=1,right=2,sum=3;
        while (left<right){
            if(sum==target){
                int[] res=new int[right-left+1];
                for (int k = left; k <=right; k++) {
                    res[k-left]=k;
                }
                list.add(res);
            }
            if(sum<target){
                right++;
                sum+=right;
            }else {
                sum-=left;
                left++;
            }

        }
        return list.toArray(new int[0][0]);

    }

}
