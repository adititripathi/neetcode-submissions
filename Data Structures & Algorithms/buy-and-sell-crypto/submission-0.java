class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int maxProfit =0;
        int buy =101;
        for(int i: prices){
            if(buy > i){
                buy =i;
            }
            profit = (i - buy) >0? i-buy :0;
            maxProfit = (maxProfit > profit) ? maxProfit : profit;
        }
        return maxProfit;
    }
}
