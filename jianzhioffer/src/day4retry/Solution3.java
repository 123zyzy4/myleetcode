package day4retry;

public class Solution3 {
    public int missingNumber(int[] nums) {
        int low=0,high= nums.length-1;
        int mid;
        while (low<=high){
            mid=(low+high)/2;
            if(nums[mid]!=mid){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
