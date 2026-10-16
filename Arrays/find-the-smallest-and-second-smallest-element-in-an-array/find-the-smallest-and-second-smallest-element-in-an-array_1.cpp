class Solution {
public:
    vector<int> minAnd2ndMin(vector<int>& arr) {
        int smallest = INT_MAX;
        int second_smallest = INT_MAX;

        for (int x : arr) {
            if (x < smallest) {
                second_smallest = smallest;
                smallest = x;
            }
            else if (x < second_smallest && x != smallest) {
                second_smallest = x;
            }
        }

        if (second_smallest == INT_MAX)
            return {-1};

        return {smallest, second_smallest};
    }
};