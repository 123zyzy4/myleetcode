package day4;

public class Solution2 {
    public int search(int[] nums, int target) {
        int low=0,high= nums.length-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(target>=nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        //可以理解成target小于等于mid的nums值就一直在右边找，这样就会找到最左边的位置，即为high此时的位置
        //比如134445 high指向最后一个4，low指向5
        int right=high;
        if(high >= 0 && nums[high] != target) return 0;//考虑high等于-1的情况，发现被最后那个return包含，
        // 找不到对应值或者只有一个值都可以用最后那个return解释
        low=0;
        high=nums.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(target>nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }//可以理解成target小于等于mid的nums值就一直在左边找，这样就会找到最左边的位置，即为low此时的位置
            //比如134445 high指向3，low指向第一个4
        }
        int left = low;
        return right - left +1;

    }
}
