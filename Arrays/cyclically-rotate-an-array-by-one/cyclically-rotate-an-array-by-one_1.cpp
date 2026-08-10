class Solution {
  public:
    void rotate(vector<int> &arr) {
        // code here
        int n = arr.size();

        // Store the last element
        int temp = arr[n - 1];

        // Shift all elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Put the last element at the first position
        arr[0] = temp;
    }
};