package day21retry;

public class Solution2 {
    public int add(int a, int b) {
        if(b==0){
            return a;
        }
        return add(a^b,a&b<<1);
    }
}
