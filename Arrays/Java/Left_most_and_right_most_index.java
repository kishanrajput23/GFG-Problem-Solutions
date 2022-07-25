class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        int start=-1;
        int end=-1;
        int n=v.length;
        for (int i=0; i<n; i++) {
            if (v[i]==x) {
                start=i;
                break;
            }
        }
        for (int i=n-1; i>=0; i--) {
            if(v[i] ==x){
                end=i;
                break;
            }
        }
        return new pair(start,end);
    }
}
