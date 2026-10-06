## [Juggler Sequence](https://www.geeksforgeeks.org/problems/juggler-sequence3930/1)

**Difficulty:** Easy  
**Topics:** Mathematics, Recursion, series  

**Problem Description:**

<p><span style="font-size: 18px;">Juggler Sequence is a series of integers&nbsp;in which the first term starts with a positive integer number&nbsp;<em>a</em>&nbsp;and the remaining terms are generated from the immediate previous term using the below recurrence relation:<br><br><img style="width: 414px; height: 122px;" src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/705067/Web/Other/2220ffd2-353d-4b30-b2aa-68fe4047f959_1685087657.png" alt="Juggler Formula"><br><br>Given a number n, find the Juggler Sequence for this number as the first term of the sequence until it becomes 1.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 9
<strong>Output:</strong> 9 27 140 11 36 6 2 1
<strong>Explaination:</strong> We start with 9 and use 
above formula to get next terms.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 6
<strong>Output:</strong> 6 2 1
<strong>Explaination:</strong> 
[6<sup>1/2</sup>] = 2. 
[2<sup>1/2</sup>] = 1.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 100</span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(n)
