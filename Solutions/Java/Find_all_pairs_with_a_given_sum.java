class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        ArrayList<pair> ans = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
       
        int i = 0 ;
        int j = (int)M-1 ;
        while (i<A.length && j >=0) {
           if (A[i]+B[j] == X) {
                ans.add(new pair(A[i],B[j]));
                i++;
                j--;
           }
            else if (A[i]+B[j]>X) {
                j--;
            }
            else{
                i++;
            }
        }
        pair [] arr = new pair[ans.size()];
        return ans.toArray(arr);
    }
}
