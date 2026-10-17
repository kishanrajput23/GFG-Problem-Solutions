## [All Pairs with Sum from 2 Arrays](https://www.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1)

**Difficulty:** Easy  
**Topics:** Arrays, Hash  

**Problem Description:**

<p><span style="font-size: 18px;">Given two unsorted arrays <strong>a[]</strong> &nbsp;and b<strong>[]</strong>, the task is to find all pairs whose sum equals <strong>x</strong> from both arrays.</span></p><p><span style="font-size: 18px;">Note:<strong>&nbsp;</strong>All pairs should be returned in increasing<strong> </strong>order of u. For eg. for two pairs (u<sub>1</sub>,v<sub>1</sub>) and (u<sub>2</sub>,v<sub>2</sub>), if u<sub>1&nbsp;</sub>&lt; u<sub>2</sub> then (u<sub>1</sub>,v<sub>1</sub>) should be returned first else second.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input: </strong>target = 9, a[] = [1, 2, 4, 5, 7], b[] = [5, 6, 3, 4, 8]
<strong>Output: <br></strong>1 8
4 5 
5 4
<strong>Explanation: </strong>(1, 8), (4, 5), (5, 4) are the pairs which sum to 9.</span>
</pre><pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">target = 8, a[] = [-1, -2, 4, -6, 5, 7], b[] = [6, 3, 4, 0]
</span><strong style="font-size: 18px;">Output:</strong><span style="font-size: 18px;">
4 4 
5 3<br></span></span></pre><pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input</strong><span style="font-size: 18px;">: target = 9, a[] = [1, 2, 4, 5, 7, 4], b[] = [5, 6, 3, 4, 8, 4]<br><strong>Output</strong>:<br>1 8<br>4 5<br>4 5<br>5 4<br>5 4
<strong>Explanation</strong>: (1, 8), (4, 5), (4, 5), (5, 4) and (5, 4) are the pairs which sum to 9.</span></span></pre>

**Expected Complexities:**

Time Complexity: O(n log n)  
Auxiliary Space: O(n)
