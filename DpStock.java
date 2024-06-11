import java.util.*;
public class DpStock {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        int res = maxProfit(arr);
        System.out.println(res);

    }
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit =0;
        for(int i=0;i< prices.length;i++){
            int cost = prices[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[i]);
        }
        return profit;

    }
}
