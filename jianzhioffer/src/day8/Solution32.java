package day8;

public class Solution32 {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,profit=0;
//        if(prices.length==0){
//            return 0;
//        }
        for (int price :prices) {
            min=Math.min(min,price);
            profit=Math.max(profit,price-min);

        }
        return profit;

    }
}
