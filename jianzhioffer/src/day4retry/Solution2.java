package day4retry;


import org.junit.jupiter.api.Test;

public class Solution2 {
    public int search(int[] nums, int target) {
        int low=0,high= nums.length-1;
        int mid;
        while (low<=high){
            mid=(low+high)/2;
            if(target>=nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        int right=high;
        if(high>=0&&nums[high]!=target){
            return 0;
        }
        low=0;
        high= nums.length-1;
        while (low<=high){
            mid=(low+high)/2;
            if(target>nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        int left=low;
        return right-left+1;
    }

    @Test
    public void test(){
        int[] a={5,7,7,8,8,9};

        int result=search(a,8);
    }
}
