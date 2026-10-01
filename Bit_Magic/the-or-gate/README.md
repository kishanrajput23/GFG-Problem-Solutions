## [Bitwise OR of a Binary Array](https://www.geeksforgeeks.org/problems/the-or-gate3122/1)

**Difficulty:** Basic  
**Topics:** Bit Magic  

**Problem Description:**

<p><span style="font-size: 18px;">You are given a binary array <strong>arr[]</strong>, r</span><span style="font-size: 18px;">eturn the bitwise OR of all elements in the array.</span></p>
<p><span style="font-size: 18px;">The OR operation follows the truth table below:</span></p>
<p><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929565/Web/Other/blobid0_1781172727.png" width="267" height="174"></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 1, 1, 0]
<strong>Output: </strong>1
<strong>Explanation:</strong>
1 | 1 = 1
1 | 1 = 1
1 | 0 = 1
Hence output is 1.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [0, 0, 1, 0]
<strong>Output: </strong>1
<strong>Explanation:</strong>
0 | 0 = 0
0 | 1 = 1
1 | 0 = 1
Hence output is 1</span>&nbsp;&nbsp;</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 1000</span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
