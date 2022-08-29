class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        int even=0, odd=0;
        for (int i=0; i<N; i++) {
            if (i%2 == 0) {
                odd += Arr[i];
            }
            else {
                even += Arr[i];
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        a.add(odd);
        a.add(even);
        return a;
    }
}
