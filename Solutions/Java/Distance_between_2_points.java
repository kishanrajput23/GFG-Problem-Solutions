class Solution
{
    public int distance(int x1, int y1, int x2, int y2)
    {
        // Code here
        return (int)(Math.round(Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2))));
    }
}
