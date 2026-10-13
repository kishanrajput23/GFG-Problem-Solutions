## [Minimum Distance in Array](https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1)

**Difficulty:** Easy  
**Topics:** Arrays  

**Problem Description:**

<p><span style="font-size: 14pt;">You are given an array, <strong>arr[]</strong>. Find the minimum<strong> </strong>index based distance between two different elements of the array, <strong>x</strong> and <strong>y</strong>. Return -1, if either <strong>x </strong>or <strong>y </strong>does not exist in the array.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 3, 2], x = 1, y = 2
<strong>Output: </strong>1<strong>
Explanation: </strong>x = 1 and y = 2. There are two distances between x and y, which are 1 and 3 out of which the least is 1.
</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [86, 39, 90, 67, 84, 66, 62], x = 42, y = 12
<strong>Output: </strong>-1<strong>
Explanation: </strong>x = 42 and y = 12. We return -1 as x and y don't exist in the array.</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [10, 20, 30, 40, 50], x = 10, y = 50
<strong>Output: </strong>4<strong>
Explanation: </strong>The distance between x = 10 (index 0) and y = 50 (index 4) is 4, which is the only distance between them.</span></pre><p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>5</sup><br>0 &lt;= arr[i], x, y &lt;= 10<sup>5<br></sup>x != y</span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(n)
