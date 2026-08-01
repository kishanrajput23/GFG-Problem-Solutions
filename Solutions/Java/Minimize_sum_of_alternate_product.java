class Compute {
    
    public long altProduct(long arr[], long n)
    {
        // Your code goes here 
        Arrays.sort(arr);
        long sum=0;
        for (int i=0; i<arr.length/2; i++) {
            sum = sum + arr[i] * arr[arr.length-1-i];
        }
        return sum;
    }
}
