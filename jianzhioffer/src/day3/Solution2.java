package day3;

public class Solution2 {
    public String reverseLeftWords(String s, int n) {
        char[] arr=s.toCharArray();
        if(arr.length<n){
            return s;
        }
        StringBuffer sb=new StringBuffer();
        for (int i = n; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        for(int i=0;i<n;i++){
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
