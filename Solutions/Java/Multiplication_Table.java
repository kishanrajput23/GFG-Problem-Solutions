//User function Template for Java
class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int i=1; i<=10; i++) {
            ls.add(i*N);
        }
        return ls;
    }
}
