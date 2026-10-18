class Solution {
  public:
    int maxProfit(vector<int> &prices) {
        // code here
        int profit = 0;
        int minCost = prices[0];

        for (int i=1; i<prices.size(); i++) {
            minCost = min(minCost, prices[i]);
            profit = max(profit, prices[i] - minCost);
        }

        return profit;    
    }
};
