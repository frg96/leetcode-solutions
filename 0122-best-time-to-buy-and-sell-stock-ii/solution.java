class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;

        for(int i = 1 ; i < prices.length; i++) {
            int dayDiff = prices[i] - prices[i-1];

            if(dayDiff > 0) {
                totalProfit += dayDiff;
            }
        }

        return totalProfit;
    }
}
