class Solution {
public:
    int findDuplicate(vector<int>& arr, int k) {
        unordered_map<int, int> mp;

        for (auto i : arr) {
            mp[i]++;
        }

        int mini = INT_MAX;

        for (auto [num, freq] : mp) {
            if (freq == k) {
                mini = min(mini, num);
            }
        }

        return mini == INT_MAX ? -1 : mini;
    }
};