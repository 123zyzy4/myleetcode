package day4retry;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public int findRepeatNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==i){
                i++;
                continue;
            }
            if(nums[nums[i]]==nums[i])return nums[i];

            int temp=nums[nums[i]];
            nums[nums[i]]=nums[i];
            nums[i]=temp;

        }
        return -1;

    }
}
