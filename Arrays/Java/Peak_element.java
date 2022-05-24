class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n) {
       //add code here.
        int st=0,end=n-1;
        int mid=st+(end-st)/2;
        while(st<end) { 
            if(arr[mid]<arr[mid+1]) {
                st=mid+1;
            }
            else {
                end=mid;
            }
            mid=st+(end-st)/2;
        }
        return st;
    }
}
