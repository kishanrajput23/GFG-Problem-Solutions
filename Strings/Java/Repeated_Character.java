class Solution
{
    char firstRep(String S) {
        // your code here
        for (int i=0; i<S.length(); i++) { 
            for (int j=i+1; j<S.length(); j++) {
                if(S.charAt(i) == S.charAt(j)) {
                    return(S.charAt(i));
                }
            }     
        }
        return '#';
    }
}
