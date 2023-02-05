package day10;

public class Solution1 {
    public int translateNum(int num) {
        int firstnum;
        int secondnum;
        int pre=1;
        int prepre=1;
        int count=1;
        while(num!=0){
            firstnum=num%10;
            secondnum=num/10%10;
            if((secondnum*10+firstnum)<=25&&num/10>0&&secondnum!=0){
                count=pre+prepre;
            }
            num=num/10;
            prepre=pre;
            pre=count;
        }
        return count;


    }
}
