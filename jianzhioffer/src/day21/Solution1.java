package day21;

public class Solution1 {

    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            //与1进行与操作
            if((n & 1) ==0){
                count++;
            }
            //无符号右移
            n=n>>>1;
        }
        return count;
    }
}
