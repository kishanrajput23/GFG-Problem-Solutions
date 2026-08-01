class Check{    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<n; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            }
            else {
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }
        for (int i=0; i<n; i++) {
            if (hm.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return 0;
    }  
}
