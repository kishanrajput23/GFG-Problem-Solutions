class Solution
{
    // Complete the function
    int remainderWith7(String num)
    {
        // Your code here
        java.math.BigInteger b1 = new java.math.BigInteger(num);
        java.math.BigInteger b2 = new java.math.BigInteger("7");
        java.math.BigInteger number = b1.mod(b2);
        int n = number.intValue();
        return n;
    }
}
