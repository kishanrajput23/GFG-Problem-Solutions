class Sol
{
    Boolean check (String s)
    {
        // your code here   
        char first=s.charAt(0);
        for (int i=0; i<s.length(); i++) {
           if (first!=s.charAt(i)) {
               return false;
            }
        }  
        return true;
    }
}
