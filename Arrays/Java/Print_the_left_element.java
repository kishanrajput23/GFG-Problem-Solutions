class Solution {
    
    public long leftElement(long arr[], long n)
    {
        // Your code goes here 
        Arrays.sort(arr);
        if(n % 2 == 0){
            return arr[(int)(n/2)-1];
        }
        else {
            return arr[(int)n/2];
       }
    }
}
