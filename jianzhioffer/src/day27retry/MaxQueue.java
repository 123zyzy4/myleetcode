package day27retry;


import java.net.Inet4Address;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {
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
