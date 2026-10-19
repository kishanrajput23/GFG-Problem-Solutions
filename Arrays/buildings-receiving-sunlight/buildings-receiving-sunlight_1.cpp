class Solution {
public:
    int visibleBuildings(vector<int>& arr) {
        int count = 1;
        int maxi = arr[0];

        for (int i = 1; i < arr.size(); i++) {
            if (arr[i] >= maxi) {
                count++;
                maxi = arr[i];
            }
        }

        return count;
    }
};