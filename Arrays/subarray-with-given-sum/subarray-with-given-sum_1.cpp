class Solution {
  public:
    vector<int> subarraySum(vector<int> &arr, int target) {
        // code here
        int i = 0, j = 0;
        long long sum = 0;
        int n = arr.size();

        while (j < n) {
            sum += arr[j];
            
            if (sum == target) {
                return {i+1, j+1};
            }

            while (sum > target && i < j) {
                // shrink window from left side
                sum -= arr[i];
                i++;
                
                if (sum == target) {
                    return {i+1, j+1};
                }
            }
            j++;
        }
        return {-1};
        
    }
};