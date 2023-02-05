package day17retry;

import java.util.Arrays;

public class Solution1 {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr,0, arr.length-1);
        return Arrays.copyOf(arr, k);
    }
    //再写一次快排
    private void quickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int i=low,j=high;
        int temp=arr[low];
        while(i<j){
            while(arr[j]>=temp&&i<j){
                j--;
            }while(arr[i]<=temp&&i<j){
                i++;
            }
            int temp2=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        arr[low]=arr[i];
        arr[i]=temp;
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);
    }
}
