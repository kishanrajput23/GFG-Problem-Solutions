class Solution:
    def getCompundInterest(self, P ,T , N , R):
        # code here
        result = P*pow((1+(R/100)/N), N*T) 
        
        return int(result)
