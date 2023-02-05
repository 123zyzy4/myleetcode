package day13retry;

public class Solution1 {
    public int[] exchange(int[] nums) {
        int i=0,j= nums.length-1;
        while(i<j){
            while(nums[i]%2!=0&&i<j){
                i++;
            }
            while(nums[j]%2==0&&i<j){
                j--;
            }
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;
    }
}
