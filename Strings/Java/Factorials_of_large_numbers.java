class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer>al=new ArrayList<>();
        java.math.BigInteger fact=java.math.BigInteger.valueOf(1);
        for (int i=1; i<=N; i++) {
            fact = fact.multiply(java.math.BigInteger.valueOf(i));
        }
        String ans=String.valueOf(fact);
        for (int i=0; i<ans.length(); i++) {
            int num = Integer.parseInt(String.valueOf(ans.charAt(i)));
            al.add(num);
        }
        return al;
    }
}
