## [Sum Palindrome](https://www.geeksforgeeks.org/problems/sum-palindrome3857/1)

**Difficulty:** Basic  
**Topics:** Mathematics, palindrome  

**Problem Description:**

<p><span style="font-size: 18px;">Given a number, reverse it and add it to itself unless it becomes a palindrome or return <strong>-1</strong> if the number of iterations becomes more than <strong>5</strong>. R</span><span style="font-size: 18px;">eturn that palindrome number if it becomes a palindrome else, it returns -1.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: n = 23<br><strong>Output:</strong> 55&nbsp;<br><strong>Explanation</strong>: reverse(23) = 32, then 32+23 = 55 which is a palindrome. </span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 73<br><strong>Output: </strong>121<br><strong>Explanation</strong>: reverse(73) = 37, then 37+73 = 110 which is not a palindrome, again reverse(110)= 011, then 110+11 = 121 which is a palindrome.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n &lt;= 10<sup>4</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
