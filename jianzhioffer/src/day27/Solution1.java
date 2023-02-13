package day27;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque=new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        int[] res=new int[nums.length-k+1];
        res[0]=deque.peekFirst();
        for (int i = k; i <nums.length; i++) {
            if(deque.peekFirst() == nums[i - k])
                deque.removeFirst();
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i-k+1]=deque.peekFirst();
        }
        return res;
    }
}
