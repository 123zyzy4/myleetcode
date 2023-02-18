package day29retry;

import java.util.Arrays;

public class Solution3 {
    public double[] dicesProbability(int n) {
        double[] num=new double[6];
        Arrays.fill(num,1.0/6.0);
        for (int i = 1; i < n; i++) {
            double[] temp=new double[5*(i+1)+1];
            for (int j = 0; j < num.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j+k]+=num[j]/6.0;
                }
            }
            num=temp;
        }
        return num;

    }
}
