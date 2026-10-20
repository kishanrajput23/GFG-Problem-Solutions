class Solution {
public:
    void replaceWithRank(vector<int>& arr) {
        int n = arr.size();
        vector<pair<int, int>> arr1;

        for (int i = 0; i < n; i++) {
            arr1.push_back({arr[i], i});
        }

        sort(arr1.begin(), arr1.end());

        for (int rank = 0; rank < n; rank++) {
            arr[arr1[rank].second] = rank;
        }
    }
};