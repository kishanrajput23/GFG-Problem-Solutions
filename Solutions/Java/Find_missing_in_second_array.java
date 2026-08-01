class Solution
{
    ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
     Set<Long> a = new HashSet<Long>();
        for(int i=0;i<M;i++){
            a.add(B[i]);
        }
        ArrayList<Long>list=new ArrayList<>();
        for(int i=0;i<N;i++){
            if(!a.contains(A[i])){
                list.add(A[i]);
            }
        }
        return list;   
    }
}
