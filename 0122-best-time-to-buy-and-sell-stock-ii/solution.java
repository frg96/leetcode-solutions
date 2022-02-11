class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        boolean holding = false;
        if(prices.length == 1)
            return profit;

        for(int i = 0; i < prices.length; ++i){
            if(i == 0){
                if(prices[i] < prices[i+1] && !holding){
                    profit -= prices[i]; //buy
                    holding = true;
                }
            }
            else if (i == prices.length-1){
                if(prices[i-1] <= prices[i] && holding){
                    profit += prices[i]; //sell
                    holding = false;
                }
            }
            else{
                if(prices[i-1] >= prices[i] && prices[i] < prices[i+1] && !holding){
                    profit -= prices[i]; //buy
                    holding = true;
                }
                else if (prices[i-1] <= prices[i] && prices[i] > prices[i+1] && holding){
                    profit += prices[i]; //sell
                    holding = false;
                }
            }            
        } 
        return profit;
    }
}
