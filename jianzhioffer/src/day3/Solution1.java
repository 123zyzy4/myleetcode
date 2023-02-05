package day3;

public class Solution1 {
    public String replaceSpace(String s) {
        char[] arr=s.toCharArray();
        StringBuffer stringBuffer=new StringBuffer();

        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=' '){
                stringBuffer.append(arr[i]);
            }else {
                stringBuffer.append("%20");
            }
        }
        return stringBuffer.toString();
    }
}
