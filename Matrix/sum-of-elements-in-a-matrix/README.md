## [Sum of Matrix](https://www.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1)

**Difficulty:** Basic  
**Topics:** Matrix  

**Problem Description:**

<p><span style="font-size: 18px;">Given a non-null integer matrix <strong>mat[][]</strong> of size <strong>n × m</strong>, compute the sum of all its elements.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>mat[][] = [[1, 0, 1],<br>                [-8, 9, -2]]
<strong>Output: </strong>1
<strong>Explanation: </strong>The sum of all elements of the matrix is: (1 + 0 + 1 - 8 + 9 - 2) = 1.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>mat[][] = [[1, 0, 1, 0, 1],
                [0, 1, 0, 1, 0],
               [-1, -1, -1, -1, -1]]
<strong>Output: </strong>0
<strong>Explanation: </strong>The sum of all elements of the matrix is: (1 + 0 + 1 + 0 + 1 + 0 + 1 + 0 + 1 + 0 - 1 - 1 - 1 - 1 - 1) = 0.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n, m ≤ 10<sup>3</sup><br>-10<sup>3</sup> ≤ mat[i][j] ≤ 10<sup>3</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n * m)  
Auxiliary Space: O(1)
