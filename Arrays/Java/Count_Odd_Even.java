class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        // Code here
        int even = 0;
        int odd = 0;
        for (int i=0; i<n; i++) {
            if (arr[i]%2==0) {
                even += 1;
            }
            else {
                odd += 1;
            }
        }
       System.out.println(odd + " " + even);
    }
}
