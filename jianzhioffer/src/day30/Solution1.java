package day30;

public class Solution1 {
//    public int[] printNumbers(int n) {
//        int[] res=new int[(int)Math.pow(10,n)-1];
//        int k=0;
//        while (k<(int)Math.pow(10,n)-1){
//            res[k]=k;
//            k++;
//        }
//        return res;
//    }

    private int[] res;
    private int nine=0,count=0,start,n;
    private char[] num,loop={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public int[] printNumbers(int n) {
        this.n=n;
        res=new int[(int)Math.pow(10,n)-1];
        num=new char[n];
        start=n-1;
        dfs(0);
        return res;
    }
    private void dfs(int x){
        if(x==n){
            String s=String.valueOf(num).substring(start);
            if(!s.equals("0")){
                //其实parseInt会帮助去掉前面多余的0，所以这些nine、start不是很需要
                res[count++]=Integer.parseInt(s);
            }
            if(n-start==nine){
                start--;
            }
            return;
        }
        for (char i :loop) {
            if(i=='9'){
                nine++;
            }
            num[x]=i;
            dfs(x+1);
        }
        nine--;

    }
}
