package day14retry;

public class Solution1 {
    public boolean exist(char[][] board, String word) {
        boolean[][] isvisited=new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(dfs(board, word, i, j, 0,isvisited)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word,int i,int j,int count,boolean[][] isvisited){
        if(i<0||j<0||i>=board.length||j>=board[0].length||isvisited[i][j]==true||board[i][j]!=word.charAt(count)){
            return false;
        }
        if(count+1==word.length()){
            return true;
        }
        isvisited[i][j]=true;
        boolean res=dfs(board, word, i+1, j, count+1,isvisited)||dfs(board, word, i-1, j, count+1,isvisited)
                ||dfs(board, word, i, j+1, count+1,isvisited)||dfs(board, word, i, j-1, count+1,isvisited);
        isvisited[i][j]=false;
        return res;

    }
}
