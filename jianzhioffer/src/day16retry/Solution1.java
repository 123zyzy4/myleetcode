package day16retry;

public class Solution1 {
    public String minNumber(int[] nums) {
        String[] strings=new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i]=String.valueOf(nums[i]);
        }
        quicksort(strings,0, nums.length-1);
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < nums.length; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }
    private void quicksort(String[] strings,int low,int high){
        if(low>=high){
            return;
        }
        int i=low,j=high;
        String temp=strings[i];
        while(i<j){
            while((strings[j]+temp).compareTo(temp+strings[j])>=0&&i<j){
                j--;
            }
            while((strings[i]+temp).compareTo(temp+strings[i])<=0&&i<j){
                i++;
            }
            String temp2=strings[i];
            strings[i]=strings[j];
            strings[j]=temp2;
        }
        strings[low]=strings[i];
        strings[i]=temp;
        quicksort(strings,low,i-1);
        quicksort(strings,i+1,high);
    }
}
