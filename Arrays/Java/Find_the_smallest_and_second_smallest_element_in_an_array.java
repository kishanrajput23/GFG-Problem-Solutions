class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long temp[] = {-1,-1};
        long min = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            if (min>a[i]) {
                min=a[i];
            }
        }
       
        //second min
        long smin=Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            if (smin>a[i] && min!=a[i]) {
                smin=a[i];
            }
        }
        if(smin==Integer.MAX_VALUE){
            return temp;
        }
       
        temp[0]=min;
        temp[1]=smin;
        return temp;
    }
}
