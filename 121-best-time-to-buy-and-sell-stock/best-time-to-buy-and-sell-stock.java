class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE,profit=0;
        for(int stockPrice:prices){
            minPrice = Math.min(minPrice, stockPrice);
            profit = Math.max(profit, stockPrice - minPrice);
        }
        return profit;
        
    }
}