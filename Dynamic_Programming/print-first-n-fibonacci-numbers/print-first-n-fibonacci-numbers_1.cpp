class Solution {
public:

    void solve(int n, vector<int>& ans) {

        // Base case
        if (ans.size() == n) {
            return;
        }

        // Generate next Fibonacci number
        int next = ans[ans.size() - 1] + ans[ans.size() - 2];

        ans.push_back(next);

        solve(n, ans);
    }

    vector<int> fibonacciNumbers(int n) {

        vector<int> ans;

        if (n == 0) {
            return ans;
        }

        // First Fibonacci number
        ans.push_back(0);

        if (n == 1) {
            return ans;
        }

        // Second Fibonacci number
        ans.push_back(1);

        // Recursively generate remaining numbers
        solve(n, ans);

        return ans;
    }
};