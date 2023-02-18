package day30retry;

public class Solution2 {
    int[] temp,nums;
    public int reversePairs(int[] nums) {
        temp=new int[nums.length];
        this.nums=nums;
        return mergeSort(0, nums.length-1);
    }
    private int mergeSort(int left,int right){
        if(left>=right){
            return 0;
        }
        int mid=(left+right)/2;
        int i=left,j=mid+1;
        int res=mergeSort(left,mid)+mergeSort(mid+1,right);
        for (int k = left; k <=right ; k++) {
            temp[k]=nums[k];
        }
        for (int k = left; k <=right ; k++) {
            if(i==mid+1){
                nums[k]=temp[j++];
            }else if(j==right+1||temp[i]<=temp[j]){
                nums[k]=temp[i++];
            }else {
                nums[k]=temp[j++];
                res+=mid-i+1;
            }

        }
        return res;


    }
}
