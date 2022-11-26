class Solution:
    def search(self, A : list, l : int, h : int, key : int):
        # l: The starting index
        # h: The ending index, you have to search the key in this range
        # Complete this function
        while l <= h:
            mid = (l+h) // 2
            if A[mid] == key:
                return mid
            elif A[l] <= A[mid]:
                if key <= A[mid] and key >= A[l]:
                    h = mid - 1
                else:
                    l = mid + 1
            else:
                if key >= A[mid] and key <= A[h]:
                    l = mid + 1
                else:
                    h = mid - 1
        return -1
