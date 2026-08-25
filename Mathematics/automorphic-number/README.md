## [Automorphic Number](https://www.geeksforgeeks.org/problems/automorphic-number4721/1)

**Difficulty:** Basic  
**Topics:** Mathematics  

**Problem Description:**

<p><span style="font-size: 18px;">Given a number <strong>n</strong>, check whether the number is an <strong>Automorphic</strong> number or not. </span><span style="font-size: 18px;">A number is called an Automorphic number if and only if the <strong>square </strong>of the number ends with the number itself.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 76
<strong>Output: </strong>Automorphic
<strong>Explanation: </strong></span><span style="font-size: 18px;">76<sup>2 </sup>= 57<strong>76</strong><br></span><span style="font-size: 14pt;">The square ends with <strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;" data-start="565" data-end="571">76</strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">, which is the original number. </span>Hence, it is an Automorphic number.</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>N = 14
<strong>Output: </strong>Not<strong> </strong>Automorphic
<strong>Explanation: </strong></span><span style="font-size: 18px;">14<sup>2</sup> = 196
The square does not end with 14. Hence, it is not an Automorphic number.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong></span></p>
<p><span style="font-size: 18px;"><span style="font-size: 18px;">You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>isAutomorphic</strong></span><strong style="font-size: 18px;">() </strong><span style="font-size: 18px;">which takes n as input parameter and returns "Automorphic" if it is&nbsp;Automorphic number otherwise returns "Not Automorphic"(Without quotes).</span></span><br>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Constranits:</strong></span><br><span style="font-size: 18px;">1 &lt;= n &lt;= 1000</span></p>

**Expected Complexities:**

Time Complexity: O(log N) (10 - base)  
Auxiliary Space: O(1)
