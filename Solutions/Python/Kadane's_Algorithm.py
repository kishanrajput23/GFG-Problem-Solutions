class Solution:
    ##Complete this function
    #Function to find the sum of contiguous subarray with maximum sum.
    def maxSubArraySum(self,arr,N):
        ##Your code here
        max_sum = -10001
        cal_sum = 0;
        for i in range(N):
            cal_sum += arr[i]
            if cal_sum > max_sum:
                max_sum = cal_sum
            if cal_sum < 0:
                cal_sum = 0
        return max_sum
