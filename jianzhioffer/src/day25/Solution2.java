package day25;

import java.util.Stack;

public class Solution2 {
    //retry可以试一试不用stack完成空间为o(1)的做法
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for (int i = 0; i < popped.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty()&&stack.peek()==popped[j]){
                stack.pop();
                j++;
            }

        }
        return stack.isEmpty();
    }

}
