## [Strong Numbers](https://www.geeksforgeeks.org/problems/strong-numbers4336/1)

**Difficulty:** Basic  
**Topics:** Mathematics, factorial  

**Problem Description:**

<p><span style="font-size: 18px;">A Strong Number is a number whose value is equal to the sum of the factorials of its digits.</span></p>
<p><span style="font-size: 18px;">Given a positive integer <strong>n</strong>, determine whether it is a Strong Number. Return <strong>true</strong> if it is a Strong Number; otherwise, return <strong>false</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>145
<strong>Output: </strong>true
<strong>Explanation: </strong></span><span style="font-size: 18px;">The sum of the factorials of its digits is: 1! + 4! + 5! = 1 + 24 + 120 = 145.
Since the sum equals the original number, 145 is a Strong Number.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>5314
<strong>Output: </strong>false
<strong>Explanation: </strong></span><span style="font-size: 18px;">The sum of the factorials of its digits is not equal to 5314. Therefore, it is not a Strong Number.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>4</sup></span></p>

**Expected Complexities:**

Time Complexity: O(Number of digits in N)  
Auxiliary Space: O(1)
