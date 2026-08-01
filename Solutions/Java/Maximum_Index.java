class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
        
        // Your code here
        int low = 0;
        int high = N-1;
        int max = -1;
        while (low <= high) {
            if (A[low] <= A[high]) { 
                max = Math.max(max,high-low);
                high = N-1;
                low++;
            }
            else {
                high--;
            }
        }
        return max; 
    }
}
