package day10retry;

public class Solution1 {
    public int translateNum(int num) {
        int firstnum,secondnum;
        int prepre=1,pre=1,cur=1;
        while(num!=0){
            firstnum=num%10;
            secondnum=num/10%10;
            if(10*secondnum+firstnum<26&&secondnum!=0){
                cur=prepre+pre;
            }else {
                cur=pre;
            }
            prepre=pre;
            pre=cur;
            num=num/10;
        }
        return cur;
    }
}
