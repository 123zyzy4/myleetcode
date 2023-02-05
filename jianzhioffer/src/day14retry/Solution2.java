package day14retry;

public class Solution2 {

    public int movingCount(int m, int n, int k) {
        boolean[][] isvisited=new boolean[m][n];
        return dfs(m,n,k,0,0,isvisited);
    }
    private int dfs(int m,int n,int k,int i,int j,boolean[][] isvisited){
        if(i>=m||j>=n||isvisited[i][j]||sum(i)+sum(j)>k){
            return 0;
        }
        isvisited[i][j]=true;
        return 1+dfs(m, n, k, i+1, j, isvisited)+dfs(m, n, k, i, j+1, isvisited);

    }
    private int sum(int x){
        int res=0;
        while (x!=0){
            res+=x%10;
            x=x/10;
        }
        return res;
    }
}
