package day24retry;

public class Solution1 {
    //重点是想出每段长度为3且尽量平均分得到的结果最大。
    //还有如果余1的话去除一个3变成2*2结果更大。
    public int cuttingRope(int n) {
        if(n<=3){
            return n-1;
        }
        int a=n/3,b=n%3;
        if(b==1){
            return (int)Math.pow(3, a - 1) * 4;
        }else if(b==2){
            return (int)Math.pow(3, a) * 2;
        }else {
            return (int)Math.pow(3, a);
        }
    }
}
