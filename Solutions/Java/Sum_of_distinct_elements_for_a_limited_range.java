class Solution
{
    long sumOfDistinct(long arr[], int N)
    {
        Arrays.sort(arr);
        long sum = 0;
        long element = 0;
        for (int i=0; i<N; i++){
           if (element<arr[i]) {
               element = arr[i];
               sum += element;
            }
        }
    return sum;
    }
}
