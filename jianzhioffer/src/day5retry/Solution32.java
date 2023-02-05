package day5retry;

import java.util.HashMap;
import java.util.Map;

public class Solution32 {
    public char firstUniqChar(String s) {
        Map<Character,Boolean> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.containsKey(s.charAt(i)));
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))==false){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
