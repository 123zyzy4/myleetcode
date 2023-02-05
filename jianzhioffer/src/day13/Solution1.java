package day13;

public class Solution1 {
    public int[] exchange(int[] nums) {
        int i=0,j= nums.length-1;
        while(i<j){
            while (nums[i]%2!=0&&i< nums.length-1){
                i++;
            }
            while (nums[j]%2==0&&j>0){
                j--;
            }
            if (i < j) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        return nums;
    }
}
