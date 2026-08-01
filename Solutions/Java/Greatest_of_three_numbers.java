class Solution {
    int greatestOfThree(int A, int B, int C) {
        // code here
        if(A>B)
        {
            if(A>C)
            return A;
            else
            return C;
        }
        else
        {
            if(B>C)
            return B;
            else
            return C;
        }
    }
}
