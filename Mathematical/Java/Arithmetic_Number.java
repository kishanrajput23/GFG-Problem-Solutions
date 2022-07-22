class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        if (C == 0) {
            if (A == B) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else if (A==B) {
            return 1;
        }
        else if (C>0 && (B-A)%C==0 && B>A) {
            return 1;
        }
        else if(C<0 && (B-A)%C ==0 && A>B) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
