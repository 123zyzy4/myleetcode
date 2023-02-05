package day5;

public class Solution3 {
    public char firstUniqChar(String s) {
        if(s.length()==0){
            return ' ';
        }
        for (int i = 0; i < s.length(); i++ ) {
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
