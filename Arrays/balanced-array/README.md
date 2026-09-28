## [Balanced Array](https://www.geeksforgeeks.org/problems/balanced-array07200720/1)

**Difficulty:** Basic  
**Topics:** Arrays  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array <strong>arr[] </strong>of even size, find the minimum value that needs to be added to any one element so that the array becomes balanced. </span><span style="font-size: 18px;">An array is considered balanced when the sum of elements in the left half is equal to the sum of elements in the right half.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr = [1, 5, 3, 2]
<strong>Output:</strong> 1
<strong>Explanation</strong>: Sum of first 2 elements is 1 + 5  = 6, Sum of last 2 elements is 3 + 2  = 5, To make the array balanced you can add 1.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr = [1, 2, 1, 2, 1, 3]
<strong>Output:</strong> 2
<strong>Explanation</strong>: Sum of first 3 elements is 1 + 2 + 1 = 4, Sum of last three elements is 2 + 1 + 3 = 6, To make the array balanced you can add 2.
</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>2&lt;=arr.size()&lt;=10<sup>7&nbsp;</sup>where arr.size() is even.<br>1&lt;=arr[i]&lt;=10<sup>5</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
