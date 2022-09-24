class Solution
{
    public int findFocalLength(float R, String type) {
        // code here
        if (type.equals("concave")) {
            return (int) (R/2);
        }
        else {
            return -(int) Math.ceil(R/2);
        }
    }
}
