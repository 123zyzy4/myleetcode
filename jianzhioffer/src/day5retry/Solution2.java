package day5retry;

public class Solution2 {
    public int minArray(int[] numbers) {
        int low=0,high= numbers.length-1;
        int mid;
        while(low<high){
            mid=(low+high)/2;
            if(numbers[mid]<numbers[high]){
                high=mid;
            }else if(numbers[mid]>numbers[high]){
                low=mid+1;
            }else{
                for(int k=low+1;k<high;k++){
                    if(numbers[k]< numbers[k-1]){
                        return numbers[k];
                    }
                }
                return numbers[low];
            }
        }
        return numbers[low];
    }
}
