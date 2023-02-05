package day20;

import org.junit.jupiter.api.Test;

public class Solution2 {
    //shit mountain
//    public double myPow(double x, int n) {
//        if(x==0){
//            return 0;
//        }
//        if(n<0){
//            x=1.0/x;;
//        }
//        if(n==1){
//            return x;
//        }
//        return myPow(x,n-1)*x;
//    }


    public double myPow(double x, int n) {
        if(x == 0) return 0;
        long b = n;//避免2147483648导致的int越界
        double res = 1.0;
        if(b < 0) {
            x = 1.0 / x;
            b = -b;
        }
        while(b>0){
            if(b%2==1){
                res*=x;
            }
            x=x*x;
            b=b/2;
        }
        return res;
    }
    @Test
    public void test(){
        System.out.println(myPow(2.0,10));

    }


}
