package day26;

public class Solution1 {
    public boolean isNumber(String s) {
        if(s==null||s.length()==0)return false;
        char[] arr=s.trim().toCharArray();
        boolean isNum=false,isE_or_e=false,isDot=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>='0'&&arr[i]<='9'){
                isNum=true;
            }else if(arr[i]=='.'){
                if(isDot||isE_or_e){
                    return false;
                }
                isDot=true;
            }else if(arr[i]=='e'||arr[i]=='E'){
                if(!isNum||isE_or_e)return false;
                isNum=false;
                isE_or_e=true;
            }else if(arr[i]=='+'||arr[i]=='-'){
                if(i!=0&&arr[i-1]!='e'&&arr[i-1]!='E'){
                    return false;
                }
            }else {
                return false;
            }
        }
        return isNum;
    }
}
