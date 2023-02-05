package day8;

public class Solution3 {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int[] res=new int[prices.length];
        res[prices.length-1]=0;
        for (int i = prices.length-1; i >=0 ; i--) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[i]<prices[j]){
                    res[i]= prices[j]-prices[i]+res[j];
                    break;
                }
                res[i]=0;
            }
        }
        int max=0;
        for (int i = 0; i < prices.length; i++) {
            if(res[i]>max){
                max=res[i];
            }
        }
        return max;
    }
}
