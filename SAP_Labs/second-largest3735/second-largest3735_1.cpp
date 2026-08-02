class Solution {
public:
    int getSecondLargest(vector<int> &arr) {

        int largest = INT_MIN;
        int secondLargest = INT_MIN;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == INT_MIN) ? -1 : secondLargest;
    }
};