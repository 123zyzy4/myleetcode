package day9;

public class Solution1 {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int pre=nums[0];
        int cur=nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur=nums[i];
            if(pre>0){
                cur+=pre;
            }
            max=Math.max(cur,max );
            pre=cur;
        }
        return max;
    }
}
