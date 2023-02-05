package day16;

import org.junit.jupiter.api.Test;

public class Solution1 {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        quickSort(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();
    }

    private void quickSort(String[] strs, int low, int high) {
        if(low>=high){
            return;
        }
        String temp=strs[low];
        int i=low,j=high;
        while (i<j){

            while((strs[j]+temp).compareTo((temp+strs[j]))>=0&&i<j){
                j--;
            }
            while((temp+strs[i]).compareTo((strs[i]+temp))>=0&&i<j){
                i++;
            }
            String temp2=strs[i];
            strs[i]=strs[j];
            strs[j]=temp2;
        }

        strs[low]=strs[i];
        strs[i]=temp;
        quickSort(strs,low,i-1);
        quickSort(strs,i+1,high);

    }
    @Test
    public void test(){
        int[] s={3,30,34,5,9};
        String s1=minNumber(s);
    }


}
