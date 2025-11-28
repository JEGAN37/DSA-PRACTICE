class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;

        while(r < prices.length){
            if(prices[l] < prices[r])
            {         
                int val = prices[r] - prices[l];
                if(val > max){
                    max = val;
                }
            } 
            else {
                l = r;                         
            }
            r++;                              
        }

        return max;
    }
}
