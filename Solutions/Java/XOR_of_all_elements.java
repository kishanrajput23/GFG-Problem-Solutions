class Solution{
    static ArrayList<Integer> getXor(ArrayList<Integer> A,int N){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int res = 0;
        for(int i: A) {
            res^=i;
        }
        for(int i: A) {
            list.add(res^i);
        }
        return list;
    }
}
