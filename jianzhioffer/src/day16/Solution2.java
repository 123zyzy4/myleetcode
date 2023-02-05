package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution2 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int i=0,count=0;
        while(nums[i]==0){
            i++;
        }

        for (int k = i; k < nums.length-1; k++) {
            int judge=nums[k+1]- nums[k];
            if(judge!=1){
                count+=nums[k+1]- nums[k];
            }
            if(judge==0){
                return false;
            }
        }
        if(count<=i+1){
            return true;
        }else {
            return false;
        }
    }
}
