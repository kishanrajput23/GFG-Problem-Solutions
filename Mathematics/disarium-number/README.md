## [Disarium Number](https://www.geeksforgeeks.org/problems/disarium-number1045/1)

**Difficulty:** Basic  
**Topics:** Mathematics  

**Problem Description:**

<p><span style="font-size: 18px;">Given a number<strong> n</strong>, find if it is Disarium or not. </span></p>
<p><span style="font-size: 18px;">A number is called a Disarium number if the sum of its digits raised to the power of their respective positions is equal to the number itself.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>89<strong><br>Output: </strong>true<strong><br>Explanation: </strong>8<sup>1 </sup>+ 9<sup>2 </sup>= 8 + 81 = 89, which is equal to n. Therefore, 89 is a Disarium Number, so output is true.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>81<strong><br>Output: </strong>false<strong><br>Explanation: </strong>8<sup>1 </sup>+ 1<sup>2 </sup>= 8 + 1 = 9, which is not equal to n. Therefore, 81 is not a Disarium Number, so output is false.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">0 &lt;= n &lt;= 10<sup>8</sup></span></p>

**Expected Complexities:**

Time Complexity: O(log n)  
Auxiliary Space: O(1)
