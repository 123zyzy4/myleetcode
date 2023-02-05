package day10;

import java.util.HashMap;
import java.util.Map;

public class Solution22 {
    public int lengthOfLongestSubstring(String s){
        Map<Character,Integer> map=new HashMap<>();
        int max=0,pre=0;
        for (int j = 0; j < s.length(); j++) {
            int i= map.getOrDefault(s.charAt(j),-1);
            map.put(s.charAt(j),j);
            pre=pre<(j-i)?pre+1:j-i;
            max=Math.max(max,pre);
        }
        return max;

    }
}
