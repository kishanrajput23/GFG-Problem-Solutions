class Solution {
    public long[] factorial(long a[], int n) {
        // code here
        long ans[] = new long[n];
        long max = 0;
        
        for (int i=0; i<n; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }
        
        int size = (int)(max+1);
        long fact[] = new long[size];
        fact[0] = 1;
        
        for (int i=1; i<size; i++) {
            fact[i] = i*fact[i-1]%1000000007;
        }
       
        for(int i=0; i<n; i++) { 
            ans[i] = fact[(int)(a[i])];
        }
        return ans;
    }
}
