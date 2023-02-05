package day8retry;

public class Solution1 {
    public int fib(int n) {
        int pre=0,cur=0,prepre=1;
        for (int i = 0; i < n; i++) {
            cur=(pre+prepre)%1000000007;
            prepre=pre;
            pre=cur;
        }
        return cur;
    }
}
