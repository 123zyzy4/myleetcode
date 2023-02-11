package day23;

public class Solution1 {
    public int majorityElement(int[] nums) {
        int count=1;
        int target=nums[0];
        for(int i=1;i< nums.length;++i){
            if(nums[i]!=target){
                count--;
            }else {
                count++;
            }
            if(count==0){
                target=nums[i];
                count=1;
            }
        }
        count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                count++;
            }
        }
        if(count> nums.length/2){
            return target;
        }else {
            return -1;
        }
    }
}
