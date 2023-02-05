package day8retry;

public class Solution3 {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int res=0;
        for (int price :prices) {
            if(price<min){
                min=price;
            }
            res=Math.max(res,price-min);

        }
        return res;

    }
}
