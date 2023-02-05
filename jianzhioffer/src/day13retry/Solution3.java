package day13retry;

public class Solution3 {
    public String reverseWords(String s) {
        StringBuffer sb=new StringBuffer();
        int j=s.length()-1,i=j;
        while(j>=0){
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
