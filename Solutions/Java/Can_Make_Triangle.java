class Solution 
{ 
    int[] canMakeTriangle(int A[], int N) 
    { 
        // code here
        int ans[] = new int[N-2];
        
        for(int i=0; i<A.length-2; i++) {
            
            int a = A[i];
            int b = A[i+1];
            int c = A[i+2];
            
            if((a+b)>c && (a+c)>b && (b+c)>a) {
                ans[i] = 1;
            }
            else {
                ans[i] = 0;
            }
        }
        return ans;
    }
}
