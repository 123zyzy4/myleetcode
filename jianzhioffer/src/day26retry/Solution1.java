package day26retry;

public class Solution1 {
    public boolean isNumber(String s) {
        if(s==null||s.length()==0){
            return false;
        }
        //设置几个标记
        boolean isNum=false,isEore=false,isDot=false;
        int k=0;
        s=s.trim();
        if(k<s.length()&&(s.charAt(k)=='-'||s.charAt(k)=='+')){
            k++;
        }
        for (int i = k; i < s.length(); i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                isNum=true;
            }else if(s.charAt(i)=='e'||s.charAt(i)=='E'){

                if(isEore||!isNum){
                    return false;
                }
                isEore=true;
                isNum=false;
                if((i+1)<s.length()&&(s.charAt(i+1)=='-'||s.charAt(i+1)=='+')){
                    i++;
                }
            }else if(s.charAt(i)=='.'){
                if(isDot||isEore){
                    return false;
                }
                isDot=true;

            }else {
                return false;
            }
        }
        return isNum;


    }
}
