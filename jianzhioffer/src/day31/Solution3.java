package day31;

public class Solution3 {
    public int findNthDigit(int n) {
        int digit=1;
        int start=1;
        //count会超过int的范围所以用long
        long count=9;
        while (n>count){
            n-=count;
            start*=10;
            digit++;
            count=(long)start*9*digit;
        }
        long num=start+(n-1)/digit;
        return Long.toString(num).charAt((n-1)%digit)-'0';
    }
}
