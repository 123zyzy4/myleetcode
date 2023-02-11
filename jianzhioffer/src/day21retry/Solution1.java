package day21retry;

public class Solution1 {
    public int hammingWeight(int n) {
        int res=0;
        while (n!=0){
            if((n&1)==1){
                res++;
            }
            //>>为带符号右移 >>>为 无符号右移
            n>>>=1;
        }
        return res;
    }
}
