package day9retry;

public class Solution1 {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int pre=nums[0];
        int cur;
        for (int i =1; i < nums.length; i++) {
            cur=nums[i];
            if(pre>0){
               cur+=pre;
            }
            max=Math.max(max,cur);
            pre=cur;
        }
        return max;
    }
}
