package day17;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder2 {
    //前一个超时了
    Queue<Integer> heap1, heap2;
    public MedianFinder2() {
        heap1 = new PriorityQueue<>(); // 小根堆，保存较大的一半，数量总是大于等于大根堆
        heap2 = new PriorityQueue<>(Comparator.reverseOrder()); // 大根堆，保存较小的一半
    }
    public void addNum(int num) {
        if(heap1.size() != heap2.size()) {
            heap1.add(num);
            heap2.add(heap1.poll());
        } else {
            heap2.add(num);
            heap1.add(heap2.poll());
        }
    }
    public double findMedian() {
        return heap1.size() != heap2.size() ? heap1.peek() : (heap1.peek() + heap2.peek()) / 2.0;
    }

}
