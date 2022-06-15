class Solution 
{ 
    String sort(String s) 
    {
        // code here
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
} 
