class Solution 
{ 
    static long ValidPair(int a[], int n) 
	{ 
	    // Your code goes here
	    Arrays.sort(a);
        long count=0;
        int i=0;
        int j=n-1;
        while(i<j) {
            if(a[i]+a[j]<=0) {
                i++;
            }
            else { 
                count+=j-i;
                j--;
            }
        }
        return count;
	}
} 
