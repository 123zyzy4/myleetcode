package day8;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public int fib(int n) {
        if(n==0){
            return 0;
        }
        int[] result=new int[n+1];
        result[0]=0;
        result[1]=1;

        for(int i=2;i<=n;i++){
            result[i]=result[i-1]+result[i-2];
            result[i]%=1000000007;
        }
        return result[n];

    }
}
