class Solution 
{ 
    static int[] farNumber(int N, int Arr[])
	{    
	    int lst[] = new int[N];
	    Arrays.fill(lst, -1);
        for (int i=0; i<N; i++) {
            for (int j=N-1; j>=i+1; j--) {
                if (Arr[j] < Arr[i]) {
                    lst[i] = j;
                    break;
                }
            }
        }
        return lst;
	}
} 
