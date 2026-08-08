## [Array Search](https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=1&difficulty=Basic&status=solved)

**Difficulty:** Basic  
**Topics:** Arrays, Searching  

**Problem Description:**

<p><span style="font-size: 14pt;">Given an array, <strong>arr[]</strong> of n integers, and an integer element <strong>x</strong>, find whether element x is present in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 3, 4], x = 3<br><strong>Output: </strong>2<strong>
Explanation: </strong>For array [1, 2, 3, 4], the element to be searched is 3. Since 3 is present at index 2, the output is 2.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [10, 8, 30, 4, 5], x = 5<br><strong>Output: </strong>4<strong>
Explanation: </strong>For array [10, 8, 30, 4, 5], the element to be searched is 5 and it is at index 4. So, the output is 4.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [10, 8, 30], x = 6<br><strong>Output: </strong>-1<strong>
Explanation: </strong>The element to be searched is 6 and it is not present, so we return -1.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ arr.size ≤ 10<sup>6</sup><br>0 ≤ arr[i] ≤ 10<sup>6</sup><br>0 ≤ x ≤ 10<sup>5</sup></span></p>
