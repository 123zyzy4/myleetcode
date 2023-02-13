package day26retry;

public class Solution2 {

    public int strToInt(String str) {
        int k=0,sign=1,boundary=Integer.MAX_VALUE/10;
        int res=0;
        while (k<str.length()&&str.charAt(k)==' '){
            k++;
        }
        if(k==str.length()){
            return 0;
        }
        if(str.charAt(k)=='-'){
            k++;
            sign=-1;
        }else if(str.charAt(k)=='+'){
            k++;
        }
        for (int i = k; i < str.length(); i++) {
            if(str.charAt(i)>'9'||str.charAt(i)<'0'){
                break;
            }
            if(res>boundary||(res==boundary&&str.charAt(i)>'7')){
                return sign==1?Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            res=10*res+str.charAt(i)-'0';
        }
        return sign*res;

    }
}
