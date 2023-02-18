package day27retry;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//单调队列的使用
public class Solution1 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue=new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty()&&queue.peekLast()<nums[i]){
                queue.removeLast();
            }
            queue.addLast(nums[i]);
        }
        res[0]=queue.peekFirst();
        for (int i = k; i < nums.length; i++) {
            if(nums[i-k]==queue.peekFirst()){
                queue.removeFirst();
            }
            while (!queue.isEmpty()&&queue.peekLast()<nums[i]){
                queue.removeLast();
            }
            queue.addLast(nums[i]);
            res[i-k+1]=queue.peekFirst();
        }
        return res;
    }
}
