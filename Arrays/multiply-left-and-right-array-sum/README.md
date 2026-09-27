## [Multiply Left and Right Array Sums](https://www.geeksforgeeks.org/problems/multiply-left-and-right-array-sum1555/1)

**Difficulty:** Basic  
**Topics:** Arrays  

**Problem Description:**

<p><span style="font-size: 18.6667px;">Given an array of integers <strong>arr[]</strong>, divide it into two subarrays <strong>left </strong>and <strong>right </strong>such that left contains the first half of the elements and right contains the remaining elements. If the size of the array is odd, the right subarray contains one extra element. </span><span style="font-size: 18.6667px;">Compute the sum of elements in both subarrays and return the product of these two sums.</span></p><p><span style="font-size: 18px;"><strong>Examples :</strong></span></p><pre><span style="font-size: 18px;"><strong>Input :</strong> arr = [1, 2, 3, 4]
<strong>Output :</strong> 21
<strong>Explanation: </strong>Sum up an array from index 0 to 1 = 3, Sum up an array from index 2 to 3 = 7. Their multiplication is <strong>21</strong>.
</span></pre><pre><span style="font-size: 18px;"><strong>Input :</strong> arr = [1, 2] <strong>
Output :</strong>  2 </span><br><span style="font-size: 18px;"><strong>Explanation: </strong>Their multiplication is 1*2 is equal to <strong>2</strong>.</span></pre>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
