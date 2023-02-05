package day13retry;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j= nums.length-1;
        while(i<=j){
            int cur=nums[i]+nums[j];
            if(cur<target){
                i++;
            }else if(cur>target){
                j--;
            } else  {
                break;
            }
        }
        if(nums[i]+nums[j]==target){
            int[] res={nums[i],nums[j]};
            return res;
        }else{
            return null;
        }
    }
}
