class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int diff=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-min>diff) diff=prices[i]-min;
            min=Math.min(prices[i],min);
        }
        return diff;
    }
}