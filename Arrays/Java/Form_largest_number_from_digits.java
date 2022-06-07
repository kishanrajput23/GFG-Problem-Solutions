class Solution
{
    
    public String MaxNumber(long arr[], long n)
    {
        //code here.
        StringBuilder str = new StringBuilder();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            str.append(arr[i]);
        }
        return str.reverse().toString();
    }
}
