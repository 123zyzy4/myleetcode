package day4;

import java.util.HashSet;
import java.util.Set;

public class Solution12 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for (int num :nums) {
            if(hs.contains(num))return num;
            hs.add(num);
        }
        return -1;

    }
}
