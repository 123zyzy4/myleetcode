package day5;

public class Solution2 {
    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length-2; i++) {
            if(numbers[i]>numbers[i+1]){
                return numbers[i+1];
            }
        }
        return numbers[0];
    }
}
