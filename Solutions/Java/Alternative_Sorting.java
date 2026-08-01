class Solution
{
    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        
        // Your code goes here
        ArrayList<Long> list=new ArrayList<>(); 
        Arrays.sort(arr);
        int start=0;
        int end=N-1;

        while (start<=end) {
            list.add(arr[end]);
            list.add(arr[start]);
            start++;
            end--;
        }
        return list;
    }
}
