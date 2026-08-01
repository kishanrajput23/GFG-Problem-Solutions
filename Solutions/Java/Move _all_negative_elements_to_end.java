class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i=0; i<n ;i++) {
            if(arr[i] >=0 ) {
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }
         
        int i=0;
        while(i<n) {
            for(int j=0; j<pos.size() ; j++) {
                arr[i]=pos.get(j);
                i++ ;
            }
            for(int k=0; k<neg.size() ; k++) {
                arr[i]=neg.get(k);
                i++ ;
            }
         }
    }
}
