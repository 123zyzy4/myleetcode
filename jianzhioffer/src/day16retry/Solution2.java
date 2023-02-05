package day16retry;

import org.omg.CORBA.MARSHAL;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution2 {
    public boolean isStraight(int[] nums) {
        int max=-1,min=100;
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < 5; i++) {
            if(nums[i]==0){
                continue;
            }
            if(hs.contains(nums[i])){
                return false;
            }
            hs.add(nums[i]);
            max= Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return max-min<5;
    }
}
