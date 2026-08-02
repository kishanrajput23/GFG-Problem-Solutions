class Solution {
public:
    int findMean(vector<int>& arr) {

        // Use long long because the sum can be very large
        long long sum = 0;

        // Calculate the sum of all elements
        for (int num : arr) {
            sum += num;
        }

        // Integer division automatically gives the floor
        return sum / arr.size();
    }
};