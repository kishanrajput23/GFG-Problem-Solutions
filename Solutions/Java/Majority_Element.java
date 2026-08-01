class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        if(size==1)
            return a[0];
        Arrays.sort(a);
        int count = 1;
        for (int i=0; i+1<size; i++) {
            if (a[i]==a[i+1]) {
                count++;
            }
            else {
                count=1;
                continue;
            }
            if (count>size/2) {
                return a[i];
            }
        }
        return -1;
    }
}
