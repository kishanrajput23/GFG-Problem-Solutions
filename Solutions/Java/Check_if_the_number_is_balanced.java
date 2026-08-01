class Sol
{
    Boolean balancedNumber(String N)
    {
        // your code here    
        int lSum=0,rSum=0;
        char[] chr=N.toCharArray();
        int mid=chr.length/2;
        for (int i = 0; i < mid; i++) {
            lSum+=chr[i];
        }
        for (int i = mid+1; i <chr.length; i++) {
            rSum+=chr[i];
        }
        if (lSum==rSum) {
            return true;
        }
        return false; 
    }
}
