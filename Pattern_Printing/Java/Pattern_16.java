class Solution {

    void printTriangle(int n) {
        // code here
        char ch = 'A';
        for (int i=1; i<=n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
