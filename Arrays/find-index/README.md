## [First and Last in Unosrted](https://www.geeksforgeeks.org/problems/find-index4752/1)

**Difficulty:** Easy  
**Topics:** Arrays  

**Problem Description:**

<p><span style="font-size: 18px;">Given an unsorted array <strong>arr[]</strong> of integers and a <strong>key</strong> which is present in this array. Find the <strong>start index </strong>(index where the element is first found from left in the array) and <strong>end index </strong>(index where the element is first found from right in the array). Return </span><span style="font-size: 18px;">an array of length 2 with elements start index and end index</span><span style="font-size: 18px;">. </span></p>
<p><span style="font-size: 18px;"><strong>Note: </strong>If the key does not exist in the array then return -1 for both start and end index.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [1, 2, 3, 4, 5, 5], key = 5
<strong>Output:</strong> [4, 5]
<strong>Explanation</strong>: 5 appears first time at index 4 and appears last time at index 5.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr = [6, 5, 4, 3, 1, 2], key = 4
<strong>Output:</strong> [2, 2]<br><strong>Explanation: </strong>4 appears first time and last time at index 2.<br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr = [7, 8, 6], key = 2
<strong>Output: </strong>[-1, -1]<br><strong>Explanation:</strong> Since 2 does not appear in the array, we will return -1 for both the start and end indices.<br></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size ≤ 10<sup>5</sup><br>1 ≤ arr[i], key ≤&nbsp;10<sup>9</sup>&nbsp;</span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
