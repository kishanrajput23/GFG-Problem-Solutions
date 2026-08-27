## [Parallel or Perpendicular Vectors](https://www.geeksforgeeks.org/problems/parallel-or-perpendicular4257/1)

**Difficulty:** Basic  
**Topics:** Mathematics  

**Problem Description:**

<p><span style="font-size: 14pt;">Given six integers&nbsp;</span><span style="font-size: 18.6667px;">&nbsp;a</span><sub>1</sub><span style="font-size: 18.6667px;">, a</span><sub>2</sub><span style="font-size: 18.6667px;">, a<sub>3</sub></span>,&nbsp;<span style="font-size: 14pt;">b</span><sub>1</sub><span style="font-size: 14pt;">, b</span><sub>2</sub><span style="font-size: 14pt;">, and b</span><sub>3</sub><span style="font-size: 14pt;"> representing two 3D vectors A = a</span><sub>1</sub><span style="font-size: 14pt;"> * i + a</span><sub>2</sub><span style="font-size: 14pt;"> * j + a</span><sub>3 </sub><span style="font-size: 14pt;">* k and B = b</span><sub>1</sub><span style="font-size: 14pt;"> * i + b</span><sub>2</sub><span style="font-size: 14pt;"> * j + b</span><sub>3</sub><span style="font-size: 14pt;"> * k, determine whether they are parallel, perpendicular, or neither.</span></p>
<p><span style="font-size: 14pt;">Using the dot product A.B = a<sub>1</sub> * b<sub>1</sub> + a<sub>2</sub> * b<sub>2</sub> + a<sub>3</sub> * b<sub>3</sub> and the cross product A x B = (a<sub>2</sub> * b<sub>3</sub> - a<sub>3</sub> * b<sub>2</sub>) * i - (a<sub>1</sub> * b<sub>3</sub> - a<sub>3</sub> * b<sub>1</sub>) * j + (a<sub>1</sub> * b<sub>2</sub> - a<sub>2</sub> * b<sub>1</sub>) * k:</span></p>
<ul>
<li><span style="font-size: 14pt;">If A.B = 0, then A and B are perpendicular.</span></li>
<li><span style="font-size: 14pt;">If |A x B|<sup>2</sup> = 0, then A and B are parallel.</span></li>
</ul>
<p><span style="font-size: 14pt;"><span style="font-size: 14pt;">Return <strong>1</strong> if the vectors are parallel, <strong>2</strong> if they are perpendicular, or<strong> 0</strong> otherwise.</span></span></p>
<p><span style="font-size: 14pt;"><span style="font-size: 18.6667px;"><strong>Note:</strong> If either A or B is the zero vector, both conditions above hold simultaneously (a zero vector is trivially both parallel and perpendicular to every vector). In this case, return <strong>0</strong>.</span></span></p>
<p><span style="font-size: 14pt;"><strong>Examples:<br></strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>a<sub>1</sub> = 3, a<sub>2</sub> = 2, a<sub>3</sub> = 1, b<sub>1</sub> = 6, b<sub>2</sub> = 4, b<sub>3</sub> = 2<strong>
Output: </strong>1<strong>
Explanation: </strong>|A x B|<sup>2</sup> = 0, so A and B are parallel.<strong><br></strong></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>a<sub>1</sub> = 4, a<sub>2</sub> = 6, a<sub>3</sub> = 1, b<sub>1</sub> = 1, b<sub>2</sub> = -1, b<sub>3</sub> = 2<strong>
Output: </strong>2<strong>
Explanation: </strong>A.B = 0, so A and B are perpendicular.</span></pre>
<p><span style="font-size: 18.6667px;"><strong>Constraints:</strong><br></span><span style="font-size: 18.6667px;">-100 ≤ a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub><span style="font-size: medium;">, </span><span style="font-size: 14pt;">b</span><sub>1</sub><span style="font-size: 14pt;">, b</span><sub>2</sub><span style="font-size: 14pt;">, b</span><sub>3</sub>&nbsp;≤ 100</span></p>

**Expected Complexities:**

Time Complexity: O(1)  
Auxiliary Space: O(1)
