class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        boolean b = true;
        for (int i=0; i<data.length(); i++) {
            for(int j=i+1; j<data.length(); j++) {
                if (data.charAt(i) == data.charAt(j)) {
                    b = false;
                }
            }   
        }
        return b;
    }
}
