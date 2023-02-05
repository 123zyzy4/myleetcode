package day1;

import java.util.LinkedList;

public class CQueue {

    public static void main(String[] args) {

        int num1=1,num2=7,num3=4;
        CQueue obj = new CQueue();
        obj.appendTail(num1);
        obj.appendTail(num2);
        int result1= obj.deleteHead();
        System.out.println(result1);
        obj.appendTail(num3);
        int result2= obj.deleteHead();
        System.out.println(result2);
        int result3= obj.deleteHead();
        System.out.println(result3);

        /**
         * Your CQueue object will be instantiated and called as such:
         * CQueue obj = new CQueue();
         * obj.appendTail(value);
         * int param_2 = obj.deleteHead();
         */
    }
    private LinkedList<Integer> stack1,stack2;
    public CQueue() {
        stack1=new LinkedList<>();
        stack2=new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);

    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.removeLast();
        } else if (stack1.isEmpty()) {
            return -1;
        } else {
            while (!stack1.isEmpty()) {
                int temp = stack1.removeLast();
                stack2.add(temp);
            }
            return stack2.removeLast();
        }
    }


}
