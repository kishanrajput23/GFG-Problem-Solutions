class Solution {
public:
    vector<pair<int, int>> allPairs(int target, vector<int>& arr1,
                                    vector<int>& arr2) {
        vector<pair<int, int>> ans;

        sort(arr1.begin(), arr1.end());
        sort(arr2.begin(), arr2.end());

        for (int i = 0; i < arr1.size(); i++) {
            int diff = target - arr1[i];

            auto it = lower_bound(arr2.begin(), arr2.end(), diff);

            while (it != arr2.end() && *it == diff) {
                ans.push_back({arr1[i], *it});
                it++;
            }
        }

        return ans;
    }
};