package day4;

public class Solution1 {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp=nums[i];
            for(int j=i+1;j < nums.length; j++){
                if(nums[j]==temp){
                    return temp;
                }
            }
        }
        return -1;
    }
}
