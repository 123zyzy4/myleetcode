package day31retry;

public class Solution3 {
    public int findNthDigit(int n) {
        //思路
        //确定是几位数
        //确定是第几个
        //确定是第几位
        int digit=1;

        int start=1;
        long count=9;

        while (n>count){
            n-=count;
            digit++;
            start*=10;
            count=(long)9*start*digit;
        }
        long num=start+(n-1)/digit;
        return Long.toString(num).charAt((n-1)%digit)-'0';

    }
    //剑指offer完结啦
}
