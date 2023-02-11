package day20retry;

import org.junit.jupiter.api.Test;

public class Solution2 {



    public double myPow(double x, int n) {
        if(x==0){
            return 0;
        }
        long b = n;
        double res=1.0;
        if(b<0){
            x=1.0/x;
            b=-b;
        }
        while (b!=0){
            if(b%2==1){
                res*=x;
            }
            x=x*x;
            b=b/2;
        }
        return res;
    }


}
