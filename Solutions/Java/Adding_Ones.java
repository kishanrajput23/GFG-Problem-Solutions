class Solution {

    public static void update(int a[], int n, int updates[], int k)
    {
        // Your code goes here
        for (int x : updates) {
            ++a[x-1]; 
       }
       
       int sum = a[0];
       for (int i=1; i<n; i++) {
            a[i] += sum;
            sum = a[i];
       }
    }
}
