package day1;


import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.pop();
        System.out.println(minStack.top());
    }
    /** initialize your data structure here. */
    private Stack<Integer> stack1;//原栈
    private Stack<Integer> stack2;//保存原栈中降序排列的部分（非严格降序）
    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int x) {
        stack1.add(x);

        if (stack2.isEmpty() || x <= stack2.peek()) {
            stack2.add(x);
        }


    }

    public void pop() {
        if(stack1.pop().equals(stack2.peek())){
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
