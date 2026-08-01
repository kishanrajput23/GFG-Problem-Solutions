class Solution
{
    int findDuplicate(int arr[], int N,int K)
    {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:arr) {
            if(hm.containsKey(i)) {
                hm.put(i,hm.get(i)+1);
            }
            else {
                hm.put(i,1);
            }
         
        }
        for(int i:hm.keySet()) {
            if(hm.get(i)==K) {
                a.add(i);
            }
        }
        Collections.sort(a);
        return a.get(0);
    }
}
