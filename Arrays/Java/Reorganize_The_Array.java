class Complete{
    // Function for finding maximum and value pair
    public static int[] Rearrange (int arr[], int n) {
        // Complete the function
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            if(arr[i] > -1)
                count[arr[i]]++;
   	    }
        for(int i = 0; i < count.length; i++) {
            if(count[i] > 0) {
                count[i]=i;
            }
            else {
	        count[i] = -1; 
	    }
        }
        return count;
    }
}
