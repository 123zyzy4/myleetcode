package day28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<String> ress=new LinkedList<>();
    char[] res;
    public String[] permutation(String s) {
        res=s.toCharArray();
        dfs(0);
        return ress.toArray(new String[0]);
    }
    private void dfs(int x){
        if(x==res.length-1){
            ress.add(String.valueOf(res));
            return;
        }
        //利用hashset剪枝
        HashSet<Character> set=new HashSet<>();
        for (int i = x; i < res.length; i++) {
            if(set.contains(res[i])){
                continue;
            }
            set.add(res[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }
    public void swap(int a,int b){
        char temp=res[a];
        res[a]=res[b];
        res[b]=temp;
    }
}
