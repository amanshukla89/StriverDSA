package ArraysMedium;

public class Video25 {

    //Best time to buy and sell stock
    static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i = 0;i < prices.length;i++) {
            int cost = prices[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
    void main() {
        int[] brr = {7,1,5,3,6,4} ;
        System.out.println("Maximum profit is: " + maxProfit(brr));

    }
}
