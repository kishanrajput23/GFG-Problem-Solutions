class Solution {
    public static int getBeauty(int freq[])
    {
        int minF = Integer.MAX_VALUE;
        int maxF = Integer.MIN_VALUE;
        for(int i = 1;i < 27;i++)
        {
            if(freq[i] != 0)
            minF = Math.min(minF,freq[i]);
            maxF = Math.max(maxF,freq[i]);
        }
        int beauty = maxF - minF;
        return beauty;
        
    }
    public static int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for(int i = 0;i < n;i++)
        {
            int freq[] = new int[27];
            for(int j = i; j < n;j++)
            {
                char ch = s.charAt(j);
                int ind = ch - 96;
                freq[ind]++;
                int beauty = getBeauty(freq);
                sum += beauty;
            }
        }
        return sum;
    }
}
