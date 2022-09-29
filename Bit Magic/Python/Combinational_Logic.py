class Solution {
    static int logicalOperation(int A,int B,int C,int D,int E,int F){
        // code here
        return  ((~A)&B)|(C&D)|(E&~F);
    }
}
