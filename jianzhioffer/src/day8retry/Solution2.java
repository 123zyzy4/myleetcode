package day8retry;

public class Solution2 {
    public int numWays(int n) {
        int pre=1,cur=1,prepre=0;
        for (int i = 0; i < n; i++) {
            cur=(pre+prepre)%1000000007;
            prepre=pre;
            pre=cur;
        }
        return cur;
    }
}
