package day1retry;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /** initialize your data structure here. */
    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if(stack2.empty()||x<=stack2.peek()){
            stack2.push(x);
        }
    }

    public void pop() {
        int temp=stack1.pop();
        if(temp==stack2.peek()){
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}