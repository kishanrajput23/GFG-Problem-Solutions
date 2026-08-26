## [Final Amount with Compound Interest](https://www.geeksforgeeks.org/problems/compound-interest0235/1)

**Difficulty:** Basic  
**Topics:** Mathematics  

**Problem Description:**

<p data-start="646" data-end="824"><span style="font-size: 18.6667px;">Given four integers </span><strong style="font-size: 18.6667px;">p</strong><span style="font-size: 18.6667px;">, </span><strong style="font-size: 18.6667px;">r</strong><span style="font-size: 18.6667px;">, </span><strong style="font-size: 18.6667px;">t</strong><span style="font-size: 18.6667px;">, and </span><strong style="font-size: 18.6667px;">n</strong><span style="font-size: 18.6667px;"> representing the principal amount, annual interest rate (in percentage), time period (in years), and the number of compounding periods per year respectively.</span><br><span style="font-size: 18.6667px;"><br>The final amount accumulated after <strong>t </strong>years using the compound interest formula:&nbsp;</span><br><span style="font-size: 18.6667px;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929321/Web/Other/blobid0_1783935186.png" width="215" height="63"></span><br><span style="font-size: 18.6667px;">Return the floor value of the accumulated amount A.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span><strong> </strong></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> </span><span style="font-size: 18px;">p = 1000</span>, <span style="font-size: 18px;">t = </span><span style="font-size: 18px;">2</span>, <span style="font-size: 18px;">n = </span><span style="font-size: 18px;">2</span>, <span style="font-size: 18px;">r = 10</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">1215</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">After applying compound interest for 2 years at an annual rate of 10, compounded twice per year, the accumulated amount becomes 1215.50625. Taking its floor value gives 1215.</span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> </span><span style="font-size: 18px;">p = 100</span>, <span style="font-size: 18px;">t = </span><span style="font-size: 18px;">1</span>, <span style="font-size: 18px;">n = </span><span style="font-size: 18px;">1</span>, <span style="font-size: 18px;">r = 10</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">110</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">After applying compound interest for 1 year at an annual rate of 10, compounded once per year, the accumulated amount becomes 110.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1&nbsp;<span style="font-size: 18.6667px;">≤</span>&nbsp;p&nbsp;<span style="font-size: 18.6667px;">≤</span>&nbsp;1000<br>1&nbsp;<span style="font-size: 18.6667px;">≤</span>&nbsp;t&nbsp;<span style="font-size: 18.6667px;">≤</span>&nbsp;20<br>1&nbsp;<span style="font-size: 18.6667px;">≤</span>&nbsp;n&nbsp;<span style="font-size: 18.6667px;">≤</span>&nbsp;4<br>1&nbsp;<span style="font-size: 18.6667px;">≤</span>&nbsp;r&nbsp;<span style="font-size: 18.6667px;">≤</span>&nbsp;20</span></p>

**Expected Complexities:**

Time Complexity: O(1)  
Auxiliary Space: O(1)
