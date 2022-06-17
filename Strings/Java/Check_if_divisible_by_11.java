class Sol
{
    int divisibleBy11 (String S)
    {
        // Your Code Here
        java.math.BigInteger b1 = new java.math.BigInteger(S);
        java.math.BigInteger b2 = new java.math.BigInteger("11");
        java.math.BigInteger number = b1.mod(b2);
        String str_result = number.toString();
        if (str_result.equals("0")) {
            return 1;
        }
        return 0;
    }
}
