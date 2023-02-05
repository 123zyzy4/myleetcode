package day3retry;

public class Solution1 {
    public String replaceSpace(String s) {
        char[] arr=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==' '){
                sb.append("%20");
            }else{
                sb.append(arr[i]);
            }

        }
        return sb.toString();
    }
}
