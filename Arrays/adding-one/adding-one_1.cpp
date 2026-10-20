class Solution {
public:
    vector<int> addOne(vector<int>& arr) {
        int n = arr.size();

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }

            arr[i] = 0;
        }

        arr.insert(arr.begin(), 1);
        return arr;
    }
};