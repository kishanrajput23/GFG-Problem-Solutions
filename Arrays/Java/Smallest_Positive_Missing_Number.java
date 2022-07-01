class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int s=1;
        for (int i=0; i<size; i++) {
            if (s==arr[i]) {
                s++;
            }
        }
        return s;
    }
}
