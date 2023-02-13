package day25retry;

import java.util.Stack;

public class Solution2 {
//    public boolean validateStackSequences(int[] pushed, int[] popped) {
//        Stack<Integer> stack=new Stack<>();
//        int k=0;
//        for (int each :pushed) {
//            stack.push(each);
//
//                while (!stack.isEmpty()&&stack.peek()==popped[k]){
//                    stack.pop();
//                    k++;
//                }
//
//        }
//        return k== popped.length&&stack.isEmpty();
//
//    }
    //尝试一下不用辅助栈空间复杂度为o(1)的做法
    //其实就是把pushed数组模拟成栈
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int cur1=0,cur2=0;
        for (int each :pushed) {
            pushed[cur1]=each;
            while (cur1>=0&&pushed[cur1]==popped[cur2]){
                cur2++;
                cur1--;
            }
            cur1++;

        }
        return cur1==0;

    }
}
