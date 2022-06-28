class Solution
{
    int atoi(String str) {
	// Your code here
	try {
        int c=Integer.valueOf(str);
        return c;
    }
    catch (Exception e) {
        return -1;
    }
    }
}
