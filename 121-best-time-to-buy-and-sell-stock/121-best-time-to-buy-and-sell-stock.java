class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            }
            else {
                int max = prices[i] - min;
                if (max > profit) {
                    profit = max;
                }
            }
        }
        return profit;
            
    }
}