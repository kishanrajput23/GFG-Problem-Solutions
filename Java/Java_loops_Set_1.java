class Solution{
    static ArrayList<Integer> getSum(int N){
        // code here
        ArrayList<Integer> li = new ArrayList<>();
        int odd=0, even=0;
        for (int i=1; i<=N; i++) {
            if (i%2 == 0) {
                even += i;
            }
            else {
                odd += i;
            }
        }
        li.add(even);
        li.add(odd);
        return li;
    }
}
