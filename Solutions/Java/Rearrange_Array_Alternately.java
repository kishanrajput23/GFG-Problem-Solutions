class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        ArrayList<Long> list = new ArrayList<Long>();
        Collections.sort(list);
        for (int i=0; i<n; i++) {
            list.add(arr[i]);
        }
        
        int j=0, k=n-1;
        for (int i=0; i<n; i++) {
            if (i%2==0) {
                arr[i] = list.get(k);
                k--;
            }
            else {
                arr[i] = list.get(j);
                j++;
            }
        }
    }
}
