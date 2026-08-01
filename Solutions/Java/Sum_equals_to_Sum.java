class Solution { 
    public int findPairs(int arr[],int n) { 
        //code here.
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if (hs.contains(arr[i]+arr[j])) {
                    return 1;
                }
                else {
                    hs.add(arr[i]+arr[j]);
               }
            }
        }
        return 0;
    }
}
