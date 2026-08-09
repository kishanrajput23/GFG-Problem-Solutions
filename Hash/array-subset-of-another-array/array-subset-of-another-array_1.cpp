class Solution {
public:
    bool isSubset(vector<int> &a, vector<int> &b) {

        unordered_map<int, int> freq;

        // Store frequency of elements in a
        for (int x : a) {
            freq[x]++;
        }

        // Check whether b can be formed from a
        for (int x : b) {

            if (freq[x] == 0) {
                return false;
            }

            freq[x]--;
        }

        return true;
    }
};