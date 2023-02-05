package day14;

import org.junit.jupiter.api.Test;

public class Solution1 {
    public boolean exist(char[][] board, String word) {
        boolean[][] isvisited = new boolean[board.length][board[0].length];
        boolean res=false;
        if(word.length()>board.length*board[0].length){
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {



                    if(exist(board,i,j,word,0,isvisited)){
                        return true;

                }

            }

        }
        return false;
    }

    private boolean exist(char[][] board,int i,int j, String word,int count,boolean[][] isvisited){

        if(i>= board.length||j>=board[0].length||i<0||j<0){
            return false;
        }
        if(board[i][j]!=word.charAt(count)||isvisited[i][j]==true){
            return false;
        }

        if(count==word.length()-1){
            return true;
        }
        isvisited[i][j]=true;
        boolean res= exist(board,i+1,j,word,count+1,isvisited)||exist(board,i-1,j,word,count+1,isvisited)||
                exist(board,i,j-1,word,count+1,isvisited)|| exist(board,i,j+1,word,count+1,isvisited);
        isvisited[i][j]=false;
        return res;




    }
    @Test
    public void test(){
        char[][] board={{'a','a','b','a','a','b'},{'a','a','b','b','b','a'},{'a','a','a','a','b','a'},{'b','a','b','b','a','b'},{'a','b','b','a','b','a'},{'b','a','a','a','a','b'}};

        String s="bbbaabbbbbab";
        boolean res=exist(board,s);
        System.out.println(res);
    }
}
