class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        //n = 8 i.e 1000 and n-1 = 7 i.e 0111
        //8 & 7 == 0 => 8 is a power of 2
        
        if (n==0) {
            return false;
        }
        
        return ((n&(n-1))==0);
    }
}
