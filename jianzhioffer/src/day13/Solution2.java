package day13;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        //以后双指针还是用ij吧

        int i=0,j=nums.length-1;
        while(i<=j){
            if((nums[i]+nums[j])<target){
                i++;
            }else if((nums[i]+nums[j])>target){
                j--;
            }else {
                break;
            }

        }
        int[] res= {nums[i],nums[j]};
        if((nums[i]+nums[j])==target){
            return res;
        }else {
            return null;
        }


    }
}
