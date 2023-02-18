package day29;

public class Solution1 {
    //怪难
    public boolean isMatch(String s, String p) {
        int m=s.length()+1,n=p.length()+1;
        boolean[][] dp=new boolean[m][n];
        dp[0][0]=true;
        for (int i = 2; i < n; i+=2) {
            dp[0][i]=dp[0][i-2]&&p.charAt(i-1)=='*';
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(p.charAt(j-1)=='*'){
                    //就是*表示0个的情况
                    if(dp[i][j-2]){
                        dp[i][j]=true;
                    } else if (dp[i-1][j]&&(s.charAt(i - 1)==p.charAt(j - 2)||p.charAt(j - 2) == '.')) {
                        dp[i][j]=true;
                    }
                }else {
                    if(dp[i-1][j-1]&&(s.charAt(i - 1)==p.charAt(j - 1)||p.charAt(j - 1) == '.')){
                        dp[i][j]=true;
                    }
                }
            }
        }
        return dp[m-1][n-1];
    }
}
