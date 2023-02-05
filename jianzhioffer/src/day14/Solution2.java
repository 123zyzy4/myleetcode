package day14;

public class Solution2 {
    public int movingCount(int m, int n, int k) {
        boolean[][] isvisited=new boolean[m][n];
        return dfs(m,n,0,0,k,isvisited);

    }
    private int dfs(int m,int n,int i,int j,int k,boolean[][] isvisited){
        if(i>=m||j>=n||isvisited[i][j]==true||sum(i)+sum(j)>k){
            return 0;
        }
        isvisited[i][j]=true;
        return 1+dfs(m,n,i+1,j,k,isvisited)+dfs(m,n,i,j+1,k,isvisited);

    }
    private int sum(int x){
        int sum = 0;
        while(x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;

    }
}
