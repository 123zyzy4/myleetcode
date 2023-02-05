package day19retry;

public class Solution1 {
    public int sumNums(int n) {
        return n==0?0:sumNums(n-1)+n;
    }
}
