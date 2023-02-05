package day10;

import org.junit.jupiter.api.Test;

public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int cur,pre;
        for (int i = 0; i < s.length(); i++) {
            boolean flag=true;
            String news=s.substring(i-max,i+1);
            for (int j = 0; j < max+1; j++) {
                if(news.indexOf(s.charAt(i-j))!=news.lastIndexOf(s.charAt(i-j))) {
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                max++;
            }
        }
        return max;
    }
    @Test
    public void test(){
        int res=lengthOfLongestSubstring("pwwkew");
    }
}
