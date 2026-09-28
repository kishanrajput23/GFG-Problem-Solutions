class Solution {
  public:
    int findSum(vector<int>& arr) {
        // code here
        set<int> s;
        for (int i : arr) {
            s.insert(i);
        }
    
        int sum = std::accumulate(s.begin(), s.end(), 0);
        return sum;
    }
};