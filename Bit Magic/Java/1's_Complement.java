class Solution{
    static String onesComplement(String S,int N){
        //code here
        return S.replace("0","temp").replace("1","0").replace("temp","1");
    }
}
