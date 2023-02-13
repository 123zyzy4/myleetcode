package day27;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {
//    int max;
//    int nextmax;
//    LinkedList<Integer> queue=new LinkedList<>();
//    public MaxQueue() {
//        max=Integer.MIN_VALUE;
//        nextmax=Integer.MIN_VALUE;
//        queue=new LinkedList<>();
//    }
//
//    public int max_value() {
//        if(max==Integer.MIN_VALUE){
//            return -1;
//        }
//        return max;
//    }
//
//    public void push_back(int value) {
//        queue.addLast(value);
//        if(value>=max){
//            nextmax=max;
//            max=value;
//            return;
//        }
//        if(value>nextmax){
//            nextmax=value;
//        }
//    }
//
//    public int pop_front() {
//        if(!queue.isEmpty()){
//            return queue.removeFirst();
//        }
//        return -1;
//    }
    Queue<Integer> queue;
    Deque<Integer> findMax;
    public MaxQueue() {
        queue=new LinkedList<>();
        findMax=new LinkedList<>();
    }

    public int max_value() {
//        if(queue.isEmpty()){
//            return -1;
//        }
//        return findMax.peekFirst();
        return findMax.isEmpty()?-1:findMax.peekFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!findMax.isEmpty()&&findMax.peekLast()<value){
            findMax.removeLast();
        }
        findMax.addLast(value);
    }

    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }
        int res=queue.remove();
        if (res==findMax.peekFirst()){
            findMax.removeFirst();
        }
        return res;
    }
}
