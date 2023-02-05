package day17retry;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue<Integer> pq1=null;
    PriorityQueue<Integer> pq2=null;
    public MedianFinder() {
        pq1=new PriorityQueue<>();
        pq2=new PriorityQueue<>(Comparator.reverseOrder());//也可以写(x, y) -> (y - x)
    }

    public void addNum(int num) {
        if(pq1.size()==pq2.size()){
            pq2.add(num);
            pq1.add(pq2.poll());
        }else{
            pq1.add(num);
            pq2.add(pq1.poll());
        }
    }

    public double findMedian() {
        return pq1.size()== pq2.size()?(pq1.peek()+pq2.peek())/2.0:pq1.peek();
    }
}
