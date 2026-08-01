class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    Arrays.sort(a);
        if (n <= 2) {
            return -1;
        }
        else {
            return a[n-3];
        }
    }
}
