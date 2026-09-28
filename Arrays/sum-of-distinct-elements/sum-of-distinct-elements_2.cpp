class Solution {
  public:
    int findSum(vector<int>& arr) {
        // code here
        int n = arr.size();
        sort(arr.begin(), arr.end());
        
        int sum = arr[0];
        
        for (int i=0; i<n-1; i++) {
            if (arr[i] == arr[i+1]) {
                continue;
            }
        
            sum = sum + arr[i+1];
        }    
        
        return sum;
    }
};