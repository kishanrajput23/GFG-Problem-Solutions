## [Swap Adjacent in Array](https://www.geeksforgeeks.org/problems/need-some-change/1)

**Difficulty:** Easy  
**Topics:** Arrays  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> of positive integers, swap the i<sup>th</sup> element with the (i + 2)<sup>th</sup> element for every valid i, starting from i = 0 and moving from left to right. Return the resulting array. </span><span style="font-size: 18px;">A swap is possible only when the (i + 2)<sup>th</sup> element exists.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3]
<strong>Output: </strong>[3, 2, 1]
<strong>Explanation: </strong>Swapping 1 and 3, makes the array [3, 2, 1]. There is only one swap possible in this array.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3, 4, 5]
<strong>Output: </strong>[3, 4, 5, 2, 1]
<strong>Explanation: </strong>Swapping 1 and 3, makes the array [3, 2, 1, 4, 5]. Now, swapping 2 and 4, makes the array [3, 4, 1, 2, 5]. Again,swapping 1 and 5, makes the array [3, 4, 5, 2, 1].</span></pre>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
