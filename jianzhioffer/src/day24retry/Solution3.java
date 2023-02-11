package day24retry;

public class Solution3 {
    public int lastRemaining(int n, int m) {
        int res=0;
        for (int i = 2; i <= n ; i++) {
            res=(res+m)%i;
        }
        return res;
    }
}
