class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        Arrays.sort(arr);
        return arr[0];
    }
}
