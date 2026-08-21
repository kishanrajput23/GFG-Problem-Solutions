## [nPr](https://www.geeksforgeeks.org/problems/npr4253/1)

**Difficulty:** Basic  
**Topics:** Mathematics, permutation  

**Problem Description:**

<p><span style="font-size: 18px;">Given two integers <strong>n</strong> and <strong>r</strong>, find the value of nPr, the number of ways to arrange r elements selected from n distinct elements. </span><span style="font-size: 18px;">The value of nPr is given by: </span><span style="font-size: 18px;">nPr = n! / (n − r)!, </span><span style="font-size: 18px;">where ! denotes the factorial of a number.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 5, r = 2
<strong>Output:</strong> 20
<strong>Explaination:</strong> 5!/(5-2)! = 5!/3! = 120/6 = 20.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 6, r = 3
<strong>Output:</strong> 120
<strong>Explaination:</strong> 6!/(6-3)! = 6!/3! = 720/6 = 120.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong></span><span style="font-size: 18px;">1 ≤ n ≤ 20<br></span><span style="font-size: 18px;">1 ≤ r ≤ n</span></p>

**Expected Complexities:**

Time Complexity: O(r)  
Auxiliary Space: O(1)
