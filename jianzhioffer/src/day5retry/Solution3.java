package day5retry;

public class Solution3 {
    public char firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return c;
            }
        }
        return ' ';
    }
}
