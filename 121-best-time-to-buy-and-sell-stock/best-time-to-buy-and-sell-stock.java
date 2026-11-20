class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE,profit=0;
        for(int stockPrice:prices){
            if(minPrice>stockPrice){
                minPrice=stockPrice;
            }
            if(profit<stockPrice-minPrice){
                profit=stockPrice-minPrice;
            }
        }
        return profit;
        
    }
}