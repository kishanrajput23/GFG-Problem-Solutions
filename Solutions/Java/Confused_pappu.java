class Solution { 
    long findDiff(long amount) 
    {
        // code here
        String str = String.valueOf(amount);
        String s = "";
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='6') {
                s=s+'9';
            }
            else {
               s = s+str.charAt(i);
            }
        }
        long num = Long.parseLong(s);
        return num-amount;
    }
} 
