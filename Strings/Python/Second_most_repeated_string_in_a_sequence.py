from collections import Counter
class Solution:
    def secFrequent(self, arr, n):
        # code here
        return Counter(arr).most_common(2)[1][0]
