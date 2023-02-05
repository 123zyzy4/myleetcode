package day10retry;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int index;
        int max=0,cur=0;
        for (int i = 0; i < s.length(); i++) {
            index=map.getOrDefault(s.charAt(i),-1);
            map.put(s.charAt(i),i);
            if((i-index)>cur){
                cur++;
            }else{
                cur=i-index;
            }
            max=Math.max(max,cur);
        }
        return max;
    }
}
