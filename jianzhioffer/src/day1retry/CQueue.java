package day1retry;

import java.util.Stack;

public class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.empty()) {
            return stack2.pop();
        }
        if (stack1.empty()) {
            return -1;
        }

        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();

    }
}
