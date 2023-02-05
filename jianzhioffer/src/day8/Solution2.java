package day8;

public class Solution2 {
    public int numWays(int n) {
        if(n==0){
            return 1;
        }
        int[] res=new int[n+1];
        res[0]=1;
        res[1]=1;
        for (int i = 2; i <= n; i++) {
            res[i]=res[i-1]+res[i-2];
            res[i]%=1000000007;
        }
        return res[n];
    }
//    递归版本，时间复杂度高通过不了
//    public int numWays(int n) {
//        if(n==0){
//            return 1;
//        }
//        if(n==1){
//            return 1;
//        }
//        if(n==2){
//            return 2;
//        }
//        return (numWays(n-1)+numWays(n-2))%1000000007;
//    }
}
