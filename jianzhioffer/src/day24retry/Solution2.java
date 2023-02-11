package day24retry;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Solution2 {
//    public int[] twoSum(int[] nums, int target) {
//        if(nums==null||nums.length==0||nums.length==1){
//            return null;
//        }
//        int left=0,right=nums.length-1;
//        boolean flag=false;
//        while (left<right){
//            if((nums[left]+nums[right])<target){
//                left++;
//            }else if((nums[left]+nums[right])>target){
//                right--;
//            }else {
//                return new int[]{nums[left],nums[right]}
//            }
//        }
//        return null;
//
//    }
    public int[][] findContinuousSequence(int target) {
        int left=1,right=2;
        int sum=3;
        ArrayList<int[]> list=new ArrayList<>();
        while (left<right){
            if(sum<target){
                right++;
                sum+=right;
            }else if(sum>target){
                sum-=left;
                left++;
            }else {
                int[] res=new int[right-left+1];
                for (int i = left; i <=right; i++) {
                    res[i-left]=i;
                }
                list.add(res);
                sum-=left;
                left++;
            }
        }
        return list.toArray(new int[0][]);
    }
    @Test
    public void test(){
        findContinuousSequence(9);
    }
}
