## [Nearest Multiple of 10](https://www.geeksforgeeks.org/problems/nearest-multiple-of-102437/1)

**Difficulty:** Easy  
**Topics:** Arrays, Strings, Mathematics  

**Problem Description:**

<p><span style="font-size: 14pt;">A string&nbsp;<strong>s </strong>is given to represent a positive number. The task is to round s to the nearest multiple of 10.&nbsp; </span><span style="font-size: 14pt;">If you have two multiples equally apart from s, choose the smallest element among them.</span></p>
<p><span style="font-size: 20px;"><strong>Examples:<br></strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> s = "29" <br><strong>Output:</strong> 30<br><strong>Explanation:</strong></span><strong style="font-size: 14pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><span style="font-size: 14pt;"> </span></strong><span style="font-size: 14pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><span style="font-size: 14pt;">Close</span></span><span style="font-size: 14pt;"> multiples are 20 and 30, and</span><span style="font-size: 14pt;"> 30 is the nearest to 29.</span><strong style="font-size: 14pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> </strong></pre>
<pre><span style="font-size: 20px;"><span style="font-size: 14pt;"><strong>Input:</strong> s = "15"<br><strong>Output:</strong> 10<br></span><strong style="font-size: 14pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation:</strong></span><span style="font-size: 14pt;"> 10 and 20 are equally distant multiples from 20. The smallest of the two is 10.</span></pre>
<p><span style="font-size: 20px;"><strong>Constraints:</strong><br><span style="font-size: 14pt;">1 &lt;= s.size()&lt;= 10<sup>5</sup></span></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
