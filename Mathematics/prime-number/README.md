## [Prime Number](https://www.geeksforgeeks.org/problems/prime-number2314/1)

**Difficulty:** Easy  
**Topics:** Mathematics, Prime Number  

**Problem Description:**

<p><span style="font-family: 'andale mono', monospace;"><span style="font-size: 14pt;">Given a number <strong>n</strong>, determine whether it is a <strong>prime number</strong> or not.<br></span><span style="font-size: 14pt;"><strong>Note:</strong> A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.</span></span></p><p><span style="font-size: 14pt; font-family: 'andale mono', monospace;"><strong>Examples :<br></strong></span></p><pre><span style="font-size: 14pt; font-family: 'andale mono', monospace;"><strong>Input: </strong>n = 7
<strong>Output: </strong>true
<strong>Explanation: </strong>7 has exactly two divisors: 1 and 7, making it a prime number.</span></pre><pre><span style="font-size: 14pt; font-family: 'andale mono', monospace;"><strong>Input: </strong>n = 25
<strong>Output: </strong>false
<strong>Explanation: </strong>25 has more than two divisors: 1, 5, and 25, so it is not a prime number.</span></pre><pre><span style="font-size: 14pt; font-family: 'andale mono', monospace;"><strong>Input: </strong>n = 1
<strong>Output: </strong>false
<strong>Explanation: </strong>1 has only one divisor (1 itself), which is not sufficient for it to be considered prime.</span></pre>

**Expected Complexities:**

Time Complexity: O(sqrt(n))  
Auxiliary Space: O(1)
