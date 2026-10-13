class Solution {
public:
    void segregateElements(vector<int>& arr) {
        vector<int> res;

        // Add non-negative elements first
        for (int x : arr) {
            if (x >= 0)
                res.push_back(x);
        }

        // Add negative elements
        for (int x : arr) {
            if (x < 0)
                res.push_back(x);
        }

        arr = res;
    }
};