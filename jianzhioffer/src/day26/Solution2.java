package day26;

import java.net.Inet4Address;

public class Solution2 {
//    public int strToInt(String str) {
//        char[] arr=str.trim().toCharArray();
//        if(arr==null|| arr.length==0) return 0;
//        int index=1,sign=1,res=0,boundary=Integer.MAX_VALUE/10;
//        if(arr[0]=='-'){
//            sign=-1;
//        }
//        else if(arr[0]!='+'){
//            index=0;
//        }
//        for (int i = index; i < arr.length; i++) {
//            if(arr[i]<'0'||arr[i]>'9'){
//                break;
//            }
//            if(res>boundary||(res==boundary&&arr[i]>'7')){
//                return sign==1?Integer.MAX_VALUE: Integer.MIN_VALUE;
//            }
//            res=10*res+arr[i]-'0';
//        }
//        return sign*res;
//
//    }
//改进，不用trim降低时间复杂度
    public int strToInt(String str) {
        int index=0,sign=1,res=0,boundary=Integer.MAX_VALUE/10,length = str.length();
        if(length==0){
            return 0;
        }
        while (str.charAt(index)==' '){
            if(++index==length){
                return 0;
            }
        }
        if(str.charAt(index)=='-'){
            sign=-1;
            index++;
        }else if(str.charAt(index)=='+'){
            index++;
        }
        for (int i = index; i < length; i++) {
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
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
