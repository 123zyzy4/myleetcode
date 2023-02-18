package day28retry;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    char[] num;

    List<String> res;
    public String[] permutation(String s) {
        this.num=s.toCharArray();
        res=new LinkedList<>();
        dfs(0);
        return res.toArray(new String[0]);
    }
    private void dfs(int x){
        if(x==num.length-1){
            res.add(String.valueOf(num));
        }
        HashSet<Character> set=new HashSet<>();
        for (int i = x; i <= num.length-1; i++) {
            if(set.contains(num[i])){
                continue;
            }
            set.add(num[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }

    }
    private void swap(int a,int b){
        char temp=num[a];
        num[a]=num[b];
        num[b]=temp;
    }
}
