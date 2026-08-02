class Solution {
public:
    int secFrequent(vector<string> &arr) {

        unordered_map<string, int> mp;

        // Count frequency of each string
        for (string str : arr) {
            mp[str]++;
        }

        int first = INT_MIN;
        int second = INT_MIN;

        for (auto it : mp) {

            if (it.second > first) {
                second = first;
                first = it.second;
            }
            else if (it.second > second && it.second < first) {
                second = it.second;
            }
        }

        return (second == INT_MIN) ? -1 : second;
    }
};