## [Perfect Number](https://www.geeksforgeeks.org/problems/perfect-number3759/1)

**Difficulty:** Basic  
**Topics:** Mathematics  

**Problem Description:**

<p dir="ltr"><span style="font-size: 18px;">Given a number N. Check if it is <strong>perfect</strong>&nbsp;or not. A number is <strong>perfect</strong> if sum of factorial of its digit is equal to the given number.</span></p>
<p dir="ltr"><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> N = 23
<strong>Output:</strong> 0
<strong>Explanation:</strong> The sum of factorials of 
digits of 23 is 2! + 3! = 2 + 6 = 8 
which is not equal to 23. Thus, answer 
is 0.</span></pre>
<p dir="ltr"><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> N = 145
<strong>Output:</strong> 1
<strong>Explanation:</strong> The sum of factorials of digits 
of 145 is 1! + 4! + 5! = 1 + 24 + 120 = 145 
which is equal to 145.Thus, answer is 1.</span></pre>
<p dir="ltr"><br><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read input or print anything.Your task is to complete the function <strong>isPerfect()</strong> which takes a number N as input parameter and returns 1 if N is perfect.Otherwise, it returns 0.</span></p>
<p dir="ltr"><br><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(Log<sub>10</sub>N)<br><strong>Expected Auxillary Space:</strong> O(constant)</span></p>
<p dir="ltr"><br><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&lt;=N&lt;=10<sup>9</sup></span></p>

**Expected Complexities:**

Expected Time Complexity: O(Log10N)
Expected Auxillary Space: O(constant)
