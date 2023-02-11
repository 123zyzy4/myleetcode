package day21;
/*
异或(^)相同为0，不同为1。
与运算(&)都为1，结果才为1，否则结果为0
或运算(|)两个位只要有一个为1，那么结果就是1，否则就为0
非运算(~)位为0，结果是1，如果位为1，结果是0
 */
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
