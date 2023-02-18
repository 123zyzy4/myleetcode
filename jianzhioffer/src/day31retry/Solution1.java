package day31retry;

public class Solution1 {
    public int cuttingRope(int n) {
       if(n==2||n==3){
           return n-1;
       }
       long res=1,p=1000000007;
       while (n>4){
           res*=3;
           res%=p;
           n-=3;
       }
       return (int)(res*n%p);
    }
}
