class Solution:
	def numberPattern(self, N):
		# code here
        s = ""
        st = []
        for i in range(1, N+1):
            for j in range(1, i+1):
                s += str(j)

            for j in range(i-1, 0, -1):
                s += str(j)
            st.append(s)
            s = ""
            
        return st
