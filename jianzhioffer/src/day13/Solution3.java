package day13;

public class Solution3 {
    public String reverseWords(String s) {
        StringBuffer sb=new StringBuffer();
        int i=s.length()-1,j=s.length()-1;
        while(i>=0){
            while(j>=0&&s.charAt(j)==' '){
                j--;
            }
            i=j;
            while(i>=0&&s.charAt(i)!=' '){
                i--;
            }
            sb.append(s.substring(i+1,j+1)+" ");
            j=i;
        }
        return sb.toString().trim();
    }
}
