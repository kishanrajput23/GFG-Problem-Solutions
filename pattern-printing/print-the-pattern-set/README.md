## [Print Number Pattern](https://www.geeksforgeeks.org/problems/print-the-pattern-set-1/1?page=2&difficulty=Basic&status=solved&sortBy=submissions)

**Difficulty:** Basic  
**Topics:** pattern-printing  

**Problem Description:**

<p>You are given a number <code>n</code>. You need to generate and print a pattern based on the given value of <code>n</code>.</p>
<ol>
<li>For each row, starting from the first, print numbers in descending order from <code>n</code> down to <code>1</code>.</li>
<li>Each number in a row is repeated as many times as the current row index (starting from <code>n</code>).</li>
<li>Instead of printing each row on a new line, separate rows with <code>-1</code>.</li>
<li>Instead of a newline at the end of each row, print&nbsp;<code>-1</code>&nbsp;to indicate row separation. After printing the entire pattern, end the output with <code>-1</code>.<br><br></li>
</ol>
<p><span style="font-size: 18px;"><strong>For n= 3,<br></strong></span><span style="font-size: 18px;"><strong>pattern:&nbsp; 3 3 3 2 2 2 1 1 1<br></strong></span><span style="font-size: 18px;"><strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 3 3 2 2 1 1&nbsp;<br></strong></span><span style="font-size: 18px;"><strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 3 2 1</strong></span></p>
<p><span style="font-size: 18px;"><strong>For n= 2,<br></strong></span><span style="font-size: 18px;"><strong>pattern:&nbsp; 2 2 1 1<br></strong></span><span style="font-size: 18px;"><strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 2 1</strong></span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>2<strong>
Output: </strong>[2, 2, 1, 1, -1, 2, 1, -1]</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>3<strong>
Output: </strong>[</span><span style="font-size: 18px;">3, 3, 3, 2, 2, 2, 1, 1, 1, -1, 3, 3, 2, 2, 1, 1, -1, 3, 2, 1, -1]<br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>1<strong>
Output: </strong>[1</span><span style="font-size: 18px;">, -1]</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n &lt;= 40</span></p>

**Expected Complexities:**

Time Complexity: O(n^2)  
Auxiliary Space: O(n^2)
