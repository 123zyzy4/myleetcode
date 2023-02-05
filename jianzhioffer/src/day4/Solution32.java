package day4;

public class Solution32 {
    public int missingNumber(int[] nums) {
        int low=0,high= nums.length-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==mid){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}
