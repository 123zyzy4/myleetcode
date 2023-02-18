package day30retry;

public class Solution1 {
    //考虑大数问题
    int n,k=0;
    char[] num;
    int[] res;
    public int[] printNumbers(int n) {
        this.n=n;
        res=new int[(int)Math.pow(10,n)-1];
        num=new char[n];
        dfs(0);
        return res;

    }
    private void dfs(int x){
        if(x==n){
            String s=String.valueOf(num);
            int curNum=Integer.parseInt(s);
            if(curNum!=0){
                res[k++]=curNum;
            }
            return;
        }
        for (char i = '0'; i <= '9'; i++) {
            num[x]=i;
            dfs(x+1);
        }

    }


}
